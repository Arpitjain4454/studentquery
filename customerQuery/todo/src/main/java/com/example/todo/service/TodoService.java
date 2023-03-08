package com.example.todo.service;

import com.example.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
// service layer used to write business logic
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    private static int todoCount=0;

    static{
        todos.add(new Todo(++todoCount, "Learn Spring Boot", false));
        todos.add(new Todo(++todoCount, "Learn Grocery Store", false));
        todos.add(new Todo(++todoCount, "Learn AWS", false));
        todos.add(new Todo(++todoCount, "Swimming", false));
        todos.add(new Todo(++todoCount, "Yoga", false));


        public List<Todo> findAll(){
            return todos;
        }
    }
}
