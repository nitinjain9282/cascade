package com.ib.csg.cascade.controller;


import com.ib.csg.cascade.service.TodoService;
import com.ib.csg.cascade.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ToDoController {
  @Autowired
  TodoService service; // Autowiring ToDoService for automatic management of bean


  @RequestMapping(value = "/list-todos", method = RequestMethod.GET)

  public String showtodoList(ModelMap map)

  {
    map.put("todos", service.retrivetoDos("nitin")); // harcoding to retrive todos for nitin.
    return "list-todos";
  }







}
