``SpringBoot Learn``
### 第一章 springboot支持groovy

### 第二章 springboot支持dev,test,prod环境切换
#### 2.1 propertiest配置格式
在Spring Boot中多环境配置文件名需要满足application-{profile}.properties的格式，其中{profile}对应你的环境标识，
比如：
- application-dev.properties：开发环境 
- application-test.properties：测试环境 
- application-prod.properties：生产环境

至于哪个具体的配置文件会被加载，需要在application.properties文件中通过spring.profiles.active属性来设置，其值对应{profile}值。 

如：spring.profiles.active=dev就会加载application-dev.properties配置文件内容. 

**总结多环境的配置思路：** 

application.properties中配置通用内容，并设置spring.profiles.active=dev，以开发环境为默认配置 
application-{profile}.properties中配置各个环境不同的内容,
通过命令行方式去激活不同环境的配置