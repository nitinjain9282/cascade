package com.ib.csg.cascade.service;

// test class to debug why todo retrieve method is not returning anything,
import com.ib.csg.cascade.model.ToDo;

import java.util.Date;

public class test {

    public static void main(String[] args) {
        TodoService todoService = new TodoService();
        todoService.addTodo(  "pawan", "Learn Java", new Date(), false);
        todoService.retrivetoDos("nitin");
    }
}
