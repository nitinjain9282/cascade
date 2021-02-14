## What You Will Learn during this Step:
- Magic of Spring
 - Learn about Spring Auto-wiring and Dependency Management.
 - @Autowired, @Component
 
- With Dependency Injection it makes it very easy to do unit testing for Spring Applications. 

**Annotations:** 

- @Component: In any class if we put @Component then we are requesting Spring to manage that class as a bean. Spring then takes care of lifecycle of bean. 
- @Controller:  its specialization of @Component. Its typically used in context of web applications. Typically in MVC. it's generally used for Service, Controller, or Repository too. 
- @Service:  Any component which has business logic in it, we use @Service for it.
- @repository:  its typically used in terms of datastore like JPA etc. to save data to database. 

- @Autowired: Controller is saying to autowire this service so that whenever control need instantiation of service its automatically done by Spring.
  if we remove it we will get null pointer exception.


- @ComponentScan: it defines Spring scope for packages and subpacakges wheere Components can be found. If we define @Component outside its scope it won't be picked up. 
  @SpringBootApplication is inherently defining @ComponentScan on package where its used. 
  
  

