package com.ib.csg.cascade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller  // only after we put this in java class then SpringBoot will instantiates this class

public class LoginController {

@RequestMapping (value = "/login") // This tells the path in url e.g., \login which is mapped to given method.
@ResponseBody   // method for above request mapping.
    public String sayHello(){
        return "Hello World Modified";
    }
}
