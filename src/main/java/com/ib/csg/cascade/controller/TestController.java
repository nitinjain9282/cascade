package com.ib.csg.cascade.controller;

import com.ib.csg.cascade.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class TestController {
    @Autowired
    // what's it means - its asking dependency injection framework when you find bean of this service( which we are creating using @componet then
    // autowire it here.

    TestService obj;

    @RequestMapping(value = "/test", method = RequestMethod.GET)


    public String TestMessage(ModelMap model, @RequestParam String testString) {
        model.put("testString", testString);
        return "test";
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    @ResponseBody
    public String welcome(ModelMap model, @RequestParam String testString1) {

        boolean var = obj.ValidateTest(testString1);

        return "welcome to my TestPage " +var ;
    }


}
