``SpringBoot Learn``

### 第一章 springboot支持kotlin

#### 1.1 pom.xml

```xml
<dependencys>
 <!--启用kotlin 基于jvm的静态语言-->
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib-jre8</artifactId>
            <version>${kotlin.version}</version>
        </dependency>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-test</artifactId>
            <version>${kotlin.version}</version>
            <scope>test</scope>
        </dependency>
</dependencies>
<build>
  <plugins>   
   <plugin>
       <groupId>org.jetbrains.kotlin</groupId>
       <artifactId>kotlin-maven-plugin</artifactId>
       <version>${kotlin.version}</version>
       <executions>
           <execution>
               <id>compile</id>
               <phase>compile</phase>
               <goals>
                   <goal>compile</goal>
               </goals>
           </execution>
           <execution>
               <id>test-compile</id>
               <phase>test-compile</phase>
               <goals>
                   <goal>test-compile</goal>
               </goals>
           </execution>
       </executions>
       <configuration>
           <jvmTarget>${java.version}</jvmTarget>
       </configuration>
   </plugin>
  </plugins>
</build>
```

### 第二章 多环境配置切换

#### 2.1 [maven profile多环境动态配置文件使用](http://www.cnblogs.com/cocoat/p/6921009.html)

##### 2.1.1 pom.xml

```xml
<profiles>

        <!-- =====开发环境====== -->
        <profile>
            <id>dev</id>
            <properties>
                <env>dev</env>
                <!-- 微服务配置 -->
                <dubbo.version>server.hbd</dubbo.version>
                <!-- redis缓存配置 -->
                <redis.ip>192.16.8.126</redis.ip>
                <redis.port>6379</redis.port>
                <redis.pass>cor2017</redis.pass>
                <!-- swagger接口 -->
                <swagger.enable>true</swagger.enable>
            </properties>
            <activation>
                <activeByDefault>true</activeByDefault>
            </activation>
        </profile>


        <!-- =======UAT环境========== -->
        <profile>
            <id>uat</id>
            <properties>
                <env>uat</env>
                <!-- 微服务配置 -->
                <dubbo.version>server.positec</dubbo.version>
                <!-- redis缓存配置 -->
                <redis.ip>127.0.0.1</redis.ip>
                <redis.port>15552</redis.port>
                <redis.pass>positec2017...</redis.pass>
                <!-- swagger接口 -->
                <swagger.enable>true</swagger.enable>

            </properties>
        </profile>



        <!-- ======生产环境====== -->
        <profile>
            <id>prod</id>
            <properties>
                <env>prod</env>
                <!-- 微服务配置 -->
                <dubbo.version>server.positec</dubbo.version>
                <!-- redis缓存配置 -->
                <redis.ip>127.0.0.1</redis.ip>
                <redis.port>6379</redis.port>
                <redis.pass>123</redis.pass>
                <!-- swagger接口 -->
                <swagger.enable>false</swagger.enable>
            </properties>
        </profile>
    </profiles>



    <build>
        <resources>
            <!-- 先指定 src/main/resources下所有文件及文件夹为资源文件 -->
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*</include>
                </includes>
            </resource>
            <!-- 设置对某些文件进行过滤， 这里对*.properties进行过虑，即这些文件中的${key}会被替换掉为真正的值 -->
            <resource>
                <directory>src/main/resources</directory>
                <includes>
                    <include>**/*.properties</include>
                </includes>
                <filtering>true</filtering>
            </resource>
        </resources>

         <finalName>${project.artifactId}</finalName>
        <pluginManagement>
            <plugins>
                <plugin>
                    <groupId>org.apache.maven.plugins</groupId>
                    <artifactId>maven-war-plugin</artifactId>
                    <version>2.4</version>
                    <configuration>
                        <!--<archiveClasses>true</archiveClasses>-->
                        <warName>${project.artifactId}</warName>
                        <!--<warSourceDirectory>${basedir}/src/main</warSourceDirectory>-->
                        <webappDirectory>${project.build.directory}/${project.artifactId}
                        </webappDirectory>
                        <webResources>
                            <resource>
                                <!-- 由于我是把配置文件都在/WEB-INF/config/文件夹-->
                                <!-- 所以把src/main/resources 被filter替换的文件替换dao WEB-INF/config/下-->
                                <directory>src/main/resources</directory>
                                <targetPath>WEB-INF/classes</targetPath>
                                <filtering>true</filtering>
                            </resource>
                        </webResources>
                    </configuration>
                </plugin> 
            </plugins>
        </pluginManagement>
    </build>
```

###### 2.1.2 spring boot application.properties配置文件

```xml
## spring boot 必须用@xx@符号， 不用${}
spring.profiles.active=@env@

#环境dev=开发，  prod=生产， uat=用户测试
env=@env@

#IP
redis.ip=@redis.ip@
#Port

redis.port=@redis.port@
redis.pass=@redis.pass@

dubbo.zoo.connectString=@dubbo.zoo.connectString@
dubbo.version=@dubbo.version@


swagger.enable=@swagger.enable@
```

##### 2.1.3 其他模块普通配置文件

```xml
redis.ip=${redis.ip} 
#Port 
redis.port=${redis.port}
redis.pass=${redis.pass} 
```

>**spring boot
>和普通的方式不同，需要用@@符号占位符，普通方式用${}符号占位**
>
>**profiles可以被子模块继承，**
>
>**<build>** <resources>配置很重要

### 第三章 使用H2作为测试数据库


