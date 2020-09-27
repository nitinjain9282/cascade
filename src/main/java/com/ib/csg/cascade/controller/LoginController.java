package com.ib.csg.cascade.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  // Adding @RequestParam to get data from Request.
  // Adding ModelMap to that controller can put data in model which can be retrieved by view.
  public String loginMessage(ModelMap model)
  {
    return "login";
  }

  @RequestMapping(value = "/login", method = RequestMethod.POST)
  // Adding @RequestParam to get data from Request.
  // Adding ModelMap to that controller can put data in model which can be retrieved by view.
  public String welcomeMessage(ModelMap model,@RequestParam String name, @RequestParam String password)
  {
    model.put("name", name);
    model.put("password", password);
    return "welcome";
  }

}
