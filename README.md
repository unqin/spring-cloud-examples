# 微服务 demo 

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
