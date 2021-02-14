package com.ib.csg.cascade.service;

// created simple service
// we need to call it via spring boot to recognize this service and create beans which are instantiated during runtime.


import org.springframework.stereotype.Component;

@Component  // adding @component will automatically register this service and spring boot will create beans and instantiate objects
           // at runtime. No need to do tight coupling by instantiation in controller.

public class ValidateService {

    public boolean validateUser(String userId, String password){
        // validate with dummy values
        return userId.equalsIgnoreCase("nitin") && password.equalsIgnoreCase("password");
    }

}
