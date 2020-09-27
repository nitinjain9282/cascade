package com.ib.csg.cascade.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class LoginController {

  @RequestMapping("/login")
  // Adding @RequestParam to get data from Request.
  // Adding ModelMap to that controller can put data in model which can be retrieved by view.
  public String loginMessage(@RequestParam String name, ModelMap model)
  {
    model.put("name", name);
    return "login";
  }
}
