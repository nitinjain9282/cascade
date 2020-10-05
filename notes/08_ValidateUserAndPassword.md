## What You Will Learn during this Step:
- We will create service to validate username and password.

- Created service src/main/java/com/ib/csg/cascade/service/ValidateService.java
This is simple service that will match username/password entered by user with our hardcoded values nitin/password.

- Next in  src/main/java/com/ib/csg/cascade/controller/LoginController.java, we also change the logic so that if service returns true then welcome page is displayed while if it returns false then login page will be displayed.

- New Service class needs to be instantiated in controller to create instance of class and call its methods. 
ValidateService validate = new ValidateService();

Tested, and it works until now. 


Next, we see that ValidateService is dependency of LoginController. So we need to declare it as dependency so that we need not instantiate it for calling its methods. 
That's where SpringBoot comes in and helps with Dependency Injection framework. 
Dependencies will be automwired and beans would automatically be created. 
To acheive this we need to do two things:
(a) Declare Service as dependency - Spring bean is created ==> use @Component, then entire lifecycle of bean would be managed by Spring. 
(b) Ensure auto configration or dependency injection works ==> @AutoWired


 @Autowired  // what's it means - its asking dependency injection framework when you find bean of this service( which we are creating using @componet then
          // autowire it here. 
  ValidateService validate;
  Ideally we can create ValidateService as interface so that we can have one implementation which is talkign to database while other is talking to ldap and we don;t have to change  anything in controller. 
  
It works until now. 

Next, we want to show user about invalid Credentials if he types wrong username/pass.
model.put("message","you have entered invalid credentials");
amd display message on login.jsp: <h1 style="color:red;">${message}</h1>



  
