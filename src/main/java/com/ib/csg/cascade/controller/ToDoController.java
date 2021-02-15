package com.ib.csg.cascade.controller;


import com.ib.csg.cascade.service.TodoService;
import com.ib.csg.cascade.service.ValidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;


@Controller
@SessionAttributes("name")
public class ToDoController {
    @Autowired
    TodoService service; // Autowiring ToDoService for automatic management of bean


    @RequestMapping(value = "/list-todos", method = RequestMethod.GET)

    public String showtodoList(ModelMap model) {
        String name = (String) model.get("name");  // type cast since right part was object.
        model.put("todos", service.retrivetoDos(name));

        return "list-todos";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.GET)
    public String showAddTodoPage(ModelMap model) {
        return "/showAddtodo";
    }

    @RequestMapping(value = "/add-todo", method = RequestMethod.POST)
    public String AddTodoPage(ModelMap model, @RequestParam String desc) {

        service.addTodo((String)model.get("name"),desc,new Date(),true);
        return "redirect:/list-todos";
    }


}
