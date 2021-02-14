package com.ib.csg.cascade.service;

import com.ib.csg.cascade.model.ToDo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@Service
public class TodoService {

    private static List<ToDo> toDos = new ArrayList<ToDo>();
    private static int todoCount = 3;

    //static block since it will be executed first always. Entering data to toDo list.
    static {
        toDos.add(new ToDo(1,"nitin", "Learn Java", new Date(), false));
        toDos.add(new ToDo(2,"myra", "Learn addtion", new Date(), false));
        toDos.add(new ToDo(3,"jia", "Learn abcd", new Date(), false));
        toDos.add(new ToDo(4,"silky", "do home job", new Date(), false));
        toDos.add(new ToDo(5,"tarun", "learn spring cloud", new Date(), false));
        toDos.add(new ToDo(6,"vicky", "do home job", new Date(), false));
    }

    // Retrieving data, this will return another List - filteredTodo

    public List<ToDo> retrivetoDos(String user){
        //define another list
        List<ToDo> filteredTodo = new ArrayList<ToDo>();
        for(ToDo todo:toDos){
            if(todo.getUser().equals(user)){
                filteredTodo.add(todo);
            }

        }
        System.out.println(filteredTodo);
        return filteredTodo;
    }

    public void addTodo (String user,String desc,Date targetDate,Boolean isDone){

        // toDos is an object of type List with ToDo type object. so whenever we will add new data, it will be done by calling ToDo constructor
          toDos.add(new ToDo(todoCount++ ,user, desc, targetDate,  isDone));
    }

    public void deleteTodo(int id){
        //An Iterator is an object that can be used to loop through collections,
        Iterator<ToDo> it = toDos.iterator();
        while ((it.hasNext())){    // check if next entry exists and return current entry in the list
            ToDo toDo = it.next();  // "it" is iterator object and it.next() returns toDo object list.
            if(toDo.getId() == id){
                it.remove();
            }

        }
    }

    public List<ToDo> showToDo(){
        List<ToDo> list = new ArrayList<>();
         return list;

        }


}
