# 微服务

## 技术背景
### 什么是微服务
微服务的概念源于2014年3月Martin Fowler所写的一篇文章“Microservices”。

微服务架构是一种架构模式，它提倡将单一应用程序划分成一组小的服务，服务之间互相协调、互相配合，为用户提供最终价值。每个服务运行在其独立的进程中，服务与服务间采用轻量级的通信机制互相沟通（通常是基于HTTP的RESTful API）。每个服务都围绕着具体业务进行构建，并且能够被独立地部署到生产环境、类生产环境等。另外，应尽量避免统一的、集中式的服务管理机制，对具体的一个服务而言，应根据业务上下文，选择合适的语言、工具对其进行构建。

微服务是一种架构风格，一个大型复杂软件应用由一个或多个微服务组成。系统中的各个微服务可被独立部署，各个微服务之间是松耦合的。每个微服务仅关注于完成一件任务并很好地完成该任务。在所有情况下，每个任务代表着一个小的业务能力。

## demo 
根据微笑哥的教程学的 demo
[教程链接](http://www.ityouknow.com/spring-cloud.html)

## eureka
1. pom 文件中的 eureka版本应当选择 springcloud 官网的最新版本，具体版本应该看官网，而不是看教程。
2. 使用 springcloud 的依赖版本管理

## 服务提供与调用
1. 服务调用使用的 feign 调用，需要新增依赖

        <dependency>
          <groupId>org.springframework.cloud</groupId>
          <artifactId>spring-cloud-starter-openfeign</artifactId>
          <version>2.0.0.RELEASE</version>
        </dependency>
