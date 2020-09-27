## What You Will Learn during this Step:
- Demystifying some of the magic
 - Spring Boot Starter Parent
 - Spring Boot Starter Web
 - Embedded Tomcat
 - Dev Tools
 
In our pom.xml we are using parent- **spring-boot-starter-parent**
spring-boot-starter-parent-2.3.4.RELEASE
this is further using another parent: spring-boot-dependencies
All version info you will find in spring-boot-dependencies
Also spring-boot-starter-parent have many different plugins like maven-compiler-plugin, maven-failsafe-plugin,maven-jar-plugin( to create jar files)
it has default configuration for all maven plugins. 
it also specifies default java version which we can override in pom.xml

next is C:\Users\NITINJAIN\.m2\repository\org\springframework\boot\spring-boot-starter-web\2.3.4.RELEASE\**spring-boot-starter-web**-2.3.4.RELEASE.pom
its very important dependencies
- it provides all dependencies we need for running web application 
- logging, validation, hibernate validaor etc. 
- embedded tomcat, jackson, spring mvc etc. we get from this library. 
- this is defacto library needed for developing web applciation.


Next thing is Embedded tomcat. we get this from spring boot starter web:
- spring-boot-starter-tomcat defined here.
- these embedded server are not part of application. 
- so our application not only have logic but also server to run on it.

Next is spring-boot-devtools:
- helps with automatic restart
- it keps monitoring folders for changes and if found it trigger reload of application. 
- only dynamic part is reloaded again and again which enables faster restart rather than normal restart when static part is also reloaded. 
- For intellij refer here https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#using-boot-devtools-restart
  it works automaticlly with Eclipse IDE but for Intellij, we need to trigger build to convert .java to .class file which will then trigger automatic build. **So for Intellij you need to use "Ctrl + F9" to build project which will automatically then reload your project.** 
  

  




