package com.example.endHomework.Interceptor;

import com.example.endHomework.Util.JwtUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
@Component
public class JwtInterceptor implements HandlerInterceptor {

    @Autowired
    private JwtUtil jwtUtil;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String path = request.getRequestURI();
        // 排除公开接口
        if (path.endsWith("/users/login") || path.endsWith("/login/login") || path.equals("/")) {
            return true;
        }
        String authHeader = request.getHeader("Authorization");
        // 验证token格式
        if (authHeader == null || !authHeader.startsWith("Bearer ")) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("{\"success\":false,\"message\":\"未提供有效的认证令牌\"}");
            return false;
        }
        String token = authHeader.substring(7);
        String username = jwtUtil.validateAndGetUsername(token);
        if (username == null) {
            response.setStatus(HttpStatus.UNAUTHORIZED.value());
            response.setContentType("application/json;charset=UTF-8");
            response.getWriter().write("{\"success\":false,\"message\":\"无效的认证令牌\"}");
            return false;
        }
        // 可以将用户信息存储到request属性中供后续使用
        request.setAttribute("currentUser", username);
        return true;
    }
}
