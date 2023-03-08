package com.example.todo.controller;

import com.example.todo.model.Todo;
import com.example.todo.service.TodoService;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/todo-app")
public class TodoController {

//    @PostMapping("/create-todo/id/{id}/title/{title}")

    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo){
        return null;
    }

    @GetMapping("")
    public Todo findTodoById(@PathVariable int id){
        return null;
    }

    @GetMapping("find-all")
    public Todo FindAllTodos(){
        return null;
    }

    @DeleteMapping
    public Todo deleteTodo(@PathVariable Todo todo){
        return todo;
    }
    @PutMapping
    public Todo updateTodo(@PathVariable int id, @RequestBody Todo todo) {
        return todo;
    }

    // Two types of fetching url path:-
    //1.Query parameter - http://localhost:8080/api?username=arpit
    //2. Path variable - http://localhost:8080/username/arpit


    @RequestMapping("/api")
    public String helloUser(@RequestParam String username){
        return "hello" + username;
    }

//    @RequestMapping("/api/username/{username}")
//    public String helloUser(@PathVariable String username){
//        return "hello" + username;
//    }

}


