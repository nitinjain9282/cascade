GIT repo used : https://github.com/in28minutes/spring-boot-master-class
-------------------------------------------------------------------------------------------------------------
1.First Step:  Basic Spring Boot Application Setup

Make sure before you start this course you have your fav IDE- IntellJ , Maven and Java installed and configured. 

1- go to  https://start.spring.io/ and generate project archive.You will need to define groupId, artifactId etc.
   Make sure to use Java 1.8, add dependencies - Spring Boot Starter Web and SpringBoot Devtools
   Note - we used spring initializer to initialize/bootstrap our application. 
    
2- Open IntellijIdea => File =>  import ==> project from existing sources ==> select pom from above archvie. 
   This will load all the dependencies required to build the project.
   Note- Once project is imported, you will notice, a maven project would be created which always have a defined structure and 3 most important files: 
   - src/main/java/<groupid-that-you-defined>/_CascadeApplication.java_ 
   - src/main/resources/_applications.properties_
   - src/test/java
   - _pom.xml_
   
3- Share project on github - 
   (a)From the main menu, choose VCS | Import into Version Control | Share Project on GitHub.
   (b) When connection to GitHub has been established, the Share Project on GitHub dialog opens. Specify the new repository name, the name of the remote , and enter a description of your project.

4- Right Click "CascadeApplication" and Run "CascadeApplicaiton main()", next open URL: http://localhost:8080/
   This will display "Whitelabel Error Page" indicating page has loaded successfully. 
   
Tag 1.1 created here
-------------------------------------------------------------------------------------------------------------
notes/CreateLoginPage.md
notes/2.1RequestResponse.md
Tag 2.1 created
-------------------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------------------------------------------


-------------------------------------------------------------------------------------------------------------