package com.ib.csg.cascade.controller;


import com.ib.csg.cascade.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("name")
public class LoginController {
    @Autowired  // what's it means - its asking dependency injection framework when you find bean of this service( which we are creating using @componet then
    // autowire it here.
    ValidateService validate;


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    // Adding @RequestParam to get data from Request.
    // Adding ModelMap to that controller can put data in model which can be retrieved by view.

    public String loginMessage() {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    // Adding @RequestParam to get data from Request.
    // Adding ModelMap to that controller can put data in model which can be retrieved by view.
    public String welcomeMessage(ModelMap model, @RequestParam String name, @RequestParam String password) {
        boolean isValidUser = validate.validateUser(name, password);
        if (!isValidUser) {
            model.put("message", "you have entered invalid credentials");
            return "login";
        }

        model.put("name", name);
        // model.put("password", password);  // commenting since we should not send password to jsp.
        return "welcome";

    }


}
