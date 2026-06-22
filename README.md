\# 学术事务人员管理系统 - 前端 (Academic Affairs Staff Management System - Frontend)



本项目是一款专为高效管理教务、教师及学生事务而设计的现代化、极具未来科技感的教务管理系统前端平台。系统内置了多学院专属沉浸式主题矩阵、全息 3D 动效交互以及智能 AI 辅助面板（EduBrain）。



---



\## 🔗 仓库部署信息 (Repository Matrix)



为了实现前后端分离的高效开发流，本项目源码已切分为独立代码库，请根据需求克隆对应仓库：



\*   \*\*前端核心仓库 (Frontend URL):\*\* \[https://github.com/521AR/Academic-Affairs-Staff-Management-System-nose.git](https://github.com/521AR/Academic-Affairs-Staff-Management-System-nose.git)

\*   \*\*后端服务仓库 (Backend URL):\*\* \[https://github.com/521AR/Academic-Affairs-Staff-Management-System.git](https://github.com/521AR/Academic-Affairs-Staff-Management-System.git)



---



\##  项目亮点与核心特性 (Core Telemetry)



1\.  \*\*🌌 沉浸式多主题动态切换架构 (Dynamic Themes)\*\*

&nbsp;   根据不同学院（计算机学院、理学院、外语学院、马克思主义学院、文学院、艺术学院）的文化特质，页面可深度无缝切换至对应的硅基神经网络、工业 CAD 蓝图、信仰之星、流墨画卷、艺术气泡、全球网络等科幻或人文视觉粒子矩阵背景。

2\.  \*\*🧠 嵌入式智能教务大脑 (EduBrain AI Assistant)\*\*

&nbsp;   底层无缝对接 `http://localhost:8080/api/chat` 智能会话接口。具备可自由拖拽、伸缩边界的全息悬浮球聊天面板，支持多会话管理、历史流持久化及基于当前学院主题的色彩自适应重构。

3\.  \*\*🔒 全方位安全凭证控制 (Secure Gateway)\*\*

&nbsp;   前端通过本地代理与 Web 容器（LocalStorage）拦截和携带安全令牌，与后端基于 `JwtInterceptor` 的高级自定义权限验证器进行毫秒级 Bearer Token 双向握手校验。

4\.  \*\*📊 数字化教务全景大屏 (Computational Dashboard)\*\*

&nbsp;   结合 Layui 经典版面及高级 GSAP 数字化补间动画，提供包含学生总谱率、GPU 算力集群开销、教师编制梯队、高精人才密度的多维数据 telemetry 动态感知。

5\.  \*\*🧪 物理碰撞沙盒组件 (Physics Sandbox)\*\*

&nbsp;   系统内置基于二维动量守恒物理引擎的仿真实验沙盒。用户可在画布中随心抓取、抛掷带有文献外链的粒子气泡，支持边缘硬阻尼反弹和鼠标引力黑洞。



---



\## 🛠️ 技术栈演进 (Tech Stack Matrix)



\*   \*\*视图层驱动 (View)\*\*: Vue.js (v2 / v3 混合渐进式多模块挂载)

\*   \*\*核心 UI 框架 (UI Core)\*\*: Layui v2.7.6 极简现代变体组件

\*   \*\*数据通信 (Network)\*\*: Axios (基于 RESTful 异步控制链路层)

\*   \*\*动画物理引擎 (Animation)\*\*: GSAP 3.12.5 \& 原生 Canvas 定制粒子渲染器

\*   \*\*视觉资产 (Icons)\*\*: Font Awesome v6.4.0 矢量星群库



---



\## 📂 项目结构全景 (Directory Overview)



```text

教务人员管理前端/

├── Interceptor/

│   └── JwtInterceptor.java      # 后端 JWT 安全控制拦截快照

├── html/

│   ├── collegiate/

│   │   ├── computerCollege.html # 计算机学院「 Void」全息视窗

│   │   ├── tech.html            # 理学院「CAD 工业级微观拓扑」

│   │   ├── foreignCollege.html  # 外语学院「全球互联超维信道」

│   │   ├── MarxismCollege.html  # 马克思主义学院「信仰闪烁阵列」

│   │   ├── cultureCollege.html  # 文学院「浮墨晕染叙事空间」

│   │   └── artCollege.html      # 艺术学院「粉红气泡美学原野」

│   ├── initial.html             # 系统冷启动动态自检装载序列

│   ├── homePage.html            # 迎宾量子网关大厅

│   ├── index.html               # 核心后台总控工作流主架构 (Admin)

│   ├── Userindex.html           # 普通用户/学生分布式主工作流

│   ├── studentManager.html      # 学生宏观档案谱系调度中心

│   ├── TeacherManager.html      # 教师编制及授课序列映射矩阵

│   ├── UserManager.html         # 根节点 Root 用户特权管理组

│   ├── login.html               # Admin 特权证书安全登录校验端

│   ├── UserLogin.html           # 普通用户量子指纹身份校验端

│   ├── profile.html             # 个人数字指纹面显卡

│   └── adminprofile.html        # 高级管理员密钥安全看板

├── img/                         # 全息图元、材质、静态图层资源

└── 教务人员管理前端.iml         # 项目模块配置文件# 学术事务人员管理系统 - 前端 (Academic Affairs Staff Management System - Frontend)



本项目是一款专为高效管理教务、教师及学生事务而设计的现代化、极具未来科技感的教务管理系统前端平台。系统内置了多学院专属沉浸式主题矩阵、全息 3D 动效交互以及智能 AI 辅助面板（EduBrain）。



---



\## 🔗 仓库部署信息 (Repository Matrix)



为了实现前后端分离的高效开发流，本项目源码已切分为独立代码库，请根据需求克隆对应仓库：



\*   \*\*前端核心仓库 (Frontend URL):\*\* \[https://github.com/521AR/Academic-Affairs-Staff-Management-System-nose.git](https://github.com/521AR/Academic-Affairs-Staff-Management-System-nose.git)

\*   \*\*后端服务仓库 (Backend URL):\*\* \[https://github.com/521AR/Academic-Affairs-Staff-Management-System.git](https://github.com/521AR/Academic-Affairs-Staff-Management-System.git)



---



\##  项目亮点与核心特性 (Core Telemetry)



1\.  \*\*🌌 沉浸式多主题动态切换架构 (Dynamic Themes)\*\*

&nbsp;   根据不同学院（计算机学院、理学院、外语学院、马克思主义学院、文学院、艺术学院）的文化特质，页面可深度无缝切换至对应的硅基神经网络、工业 CAD 蓝图、信仰之星、流墨画卷、艺术气泡、全球网络等科幻或人文视觉粒子矩阵背景。

2\.  \*\*🧠 嵌入式智能教务大脑 (EduBrain AI Assistant)\*\*

&nbsp;   底层无缝对接 `http://localhost:8080/api/chat` 智能会话接口。具备可自由拖拽、伸缩边界的全息悬浮球聊天面板，支持多会话管理、历史流持久化及基于当前学院主题的色彩自适应重构。

3\.  \*\*🔒 全方位安全凭证控制 (Secure Gateway)\*\*

&nbsp;   前端通过本地代理与 Web 容器（LocalStorage）拦截和携带安全令牌，与后端基于 `JwtInterceptor` 的高级自定义权限验证器进行毫秒级 Bearer Token 双向握手校验。

4\.  \*\*📊 数字化教务全景大屏 (Computational Dashboard)\*\*

&nbsp;   结合 Layui 经典版面及高级 GSAP 数字化补间动画，提供包含学生总谱率、GPU 算力集群开销、教师编制梯队、高精人才密度的多维数据 telemetry 动态感知。

5\.  \*\*🧪 物理碰撞沙盒组件 (Physics Sandbox)\*\*

&nbsp;   系统内置基于二维动量守恒物理引擎的仿真实验沙盒。用户可在画布中随心抓取、抛掷带有文献外链的粒子气泡，支持边缘硬阻尼反弹和鼠标引力黑洞。



---



\## 🛠️ 技术栈演进 (Tech Stack Matrix)



\*   \*\*视图层驱动 (View)\*\*: Vue.js (v2 / v3 混合渐进式多模块挂载)

\*   \*\*核心 UI 框架 (UI Core)\*\*: Layui v2.7.6 极简现代变体组件

\*   \*\*数据通信 (Network)\*\*: Axios (基于 RESTful 异步控制链路层)

\*   \*\*动画物理引擎 (Animation)\*\*: GSAP 3.12.5 \& 原生 Canvas 定制粒子渲染器

\*   \*\*视觉资产 (Icons)\*\*: Font Awesome v6.4.0 矢量星群库



---



\## 📂 项目结构全景 (Directory Overview)



```text

教务人员管理前端/

├── Interceptor/

│   └── JwtInterceptor.java      # 后端 JWT 安全控制拦截快照

├── html/

│   ├── collegiate/

│   │   ├── computerCollege.html # 计算机学院「 Void」全息视窗

│   │   ├── tech.html            # 理学院「CAD 工业级微观拓扑」

│   │   ├── foreignCollege.html  # 外语学院「全球互联超维信道」

│   │   ├── MarxismCollege.html  # 马克思主义学院「信仰闪烁阵列」

│   │   ├── cultureCollege.html  # 文学院「浮墨晕染叙事空间」

│   │   └── artCollege.html      # 艺术学院「粉红气泡美学原野」

│   ├── initial.html             # 系统冷启动动态自检装载序列

│   ├── homePage.html            # 迎宾量子网关大厅

│   ├── index.html               # 核心后台总控工作流主架构 (Admin)

│   ├── Userindex.html           # 普通用户/学生分布式主工作流

│   ├── studentManager.html      # 学生宏观档案谱系调度中心

│   ├── TeacherManager.html      # 教师编制及授课序列映射矩阵

│   ├── UserManager.html         # 根节点 Root 用户特权管理组

│   ├── login.html               # Admin 特权证书安全登录校验端

│   ├── UserLogin.html           # 普通用户量子指纹身份校验端

│   ├── profile.html             # 个人数字指纹面显卡

│   └── adminprofile.html        # 高级管理员密钥安全看板

├── img/                         # 全息图元、材质、静态图层资源

└── 教务人员管理前端.iml         # 项目模块配置文件

