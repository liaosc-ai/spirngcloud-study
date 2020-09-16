* maven & springcloud study

* springcloud information
1. 例如版本号 Brixton.SR5 （布里克斯顿），是以伦敦地名作为版本号，不同以往以数字作为版本号

* maven information
1. 子项目继承父项目 pom.xml 很多属性就不需要添加了
2. 由于没有系统学习 maven 所以之前构建 springcloud项目有点吃力

* other
yml 配置，通过 --- 区分不同配置


* operator steps
1. enable register center
java -jar D:\onedrive\java-demo\spring-cloud-microservice-study\microservice-discovery-eureka\target\microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer1
java -jar D:\onedrive\java-demo\spring-cloud-microservice-study\microservice-discovery-eureka\target\microservice-discovery-eureka-0.0.1-SNAPSHOT.jar --spring.profiles.active=peer2
2. startup service provider

3. 

* feign 
feign 比 restTemplate 调用简洁多了，也可以配置负载均衡

* hystrix 熔断器
1. @EnableCircuitBreaker 开启断路器功能
2. 不使用断路器会使得服务变为不可用，且更耗时；使用断路器会快速返回失败信息