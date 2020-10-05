## What You Will Learn during this Step:
- Understand importance of DispatcherServlet

## Spring MVC Request Flow
- DispatcherServlet receives HTTP Request.
- DispatcherServlet identifies the right Controller based on the URL. By /login it checks which controller is responsible to serve this request.  
- Controller executes Business Logic. Here all calculations and business logic is done. 
- Controller returns a) Model b) View Name Back to DispatcherServlet.  
- DispatcherServlet identifies the correct view (ViewResolver) by checking config details passed to it through application.properties
- DispatcherServlet makes the model available to view and executes it.
- DispatcherServlet returns HTTP Response Back.
- Flow : http://docs.spring.io/spring-framework/docs/2.0.8/reference/images/mvc.png

If we were just using Spring MVC to execute this application then we would need to configure Dispather Servler, URL mapping and many other stuff. 
But in Springboot lot of stuff happens automatically as there is a functionality called AutoConfiguration whic we get as part of SpringBoot starter web jar. 
so SpringBoot directly configures dispather servlet for us so we don't have to configure it. 
 
 