# SpringCloudAlibaba 

nacos注册中心 http://192.168.198.1:8848/nacos/index.html, 可以自己去下载nacos,这里采用的版本是 nacos-server-1.4.0.zip

【1】 nacos-config 模块为测试读取nacos中心的配置文件

【2】 nacos-provider 模块是服务提供者

【3】 nacos-consumer 模块是服务消费者，采用RestTemplate和Feign两种方式消费

【4】 nacos-sentinel 模块是服务熔断降级，持久化配置,由于Sentinel的配置默认是放在内存中的，每当应用重启或者sentinel重启都会丢失数据，我们这里使用Nacos作为配置中心持久化限流配置。
sentinel地址 http://localhost:8080/#/dashboard/home, 这里采用的版本是 1.8.0
