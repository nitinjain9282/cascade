GIT repo used : https://github.com/in28minutes/spring-boot-master-class
-------------------------------------------------------------------------------------------------------------

### First Step: Basic Spring Boot Application Setup

Make sure before you start this course you have your fav IDE- IntellJ , Maven and Java installed and configured. 

- go to https://start.spring.io/ and generate project archive.
- You will need to define groupId, artifactId etc. 
- Make sure to use Java 1.8, 
- add dependencies -> (1) Spring Boot Starter Web and (2) SpringBoot Devtools Note 
- we used a spring initializer to initialize/bootstrap our application.
    
- Open IntellijIdea => File => import ==> project from existing sources ==> select pom from above archive. 
- This will load all the dependencies required to build the project. 
- Note- Once project is imported, you will notice, a maven project would be created which always have a defined structure and 3 most important files:
   - src/main/java/<groupid-that-you-defined>/_CascadeApplication.java_ 
   - src/main/resources/_applications.properties_
   - src/test/java
   - _pom.xml_
   
- Share project on github - (a)From the main menu, choose VCS | Import into Version Control | Share Project on GitHub. 
- (b) When connection to GitHub has been established, the Share Project on GitHub dialog opens. Specify the new repository name, the name of the
  remote , and enter a description of your project.

- Right Click "CascadeApplication" and Run "CascadeApplicaiton main()", next open URL: **http://localhost:8080/** 
- This will display "Whitelabel Error Page" indicating page has loaded successfully.
   
-------------------------------------------------------------------------------------------------------------

notes/1.0_BasicSetup.md  
###### Tag 1.1 ==> Build Sample SpringBoot application from scratch
-------------------------------------------------------------------------------------------------------------
notes/2.0_CreateLoginPage.md

notes/2.1_RequestResponse.md

###### Tag 2.1  ==> Creating Login page and understanding request response
-------------------------------------------------------------------
notes/3.0_UnderstandingSpringBootFlow.md

###### Tag 3.0 ==> Demystifying SpringBoot flow
----------------------------------------
notes/4.0_MyFirstJSP.md

###### Tag 4.0 ==> Creating JSP
------------------------
notes/05_Passing_Get_parameter.md

###### Tag 5.0 ==> pass vaues to view
------------------------------
notes/06_DispatherServlet.md

###### Tag 6.0 ==> Understand Dispather Servlet
----------------------------------------
notes/07_FirstHTMLForm.md

###### Tag 7.0 ==> Create sample form and create welcome page
------------------------------------------------------
notes/08_ValidateUserAndPassword.md

###### Tag 8.0 => Validate user credentials else throw error
-----------------------------------------------------
notes/09_Autowiring_Component_concepts.md

###### Tag 9.0 ==> Annotations used in Spring
--------------------------------------

```
src/main/java/com/ib/csg/cascade/model/ToDo.java
src/main/java/com/ib/csg/cascade/service/TodoService.java
src/main/java/com/ib/csg/cascade/controller/ToDoController.java
src/main/webapp/WEB-INF/jsp/list-todos.jsp
```

###### Tag 9.3 ==> Adding Todo Service and controller and displaying simple todo message on screen.
-------------------------------------------------------------------------------------------------------------
notes/10.Architecture_web_Applications.md

notes/11.SessionAttributes.md

###### Tag 10 ==> Adding Session Attribute to persist "name" value across sessions
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------
-------------------------------------------------------------------------------------------------------------