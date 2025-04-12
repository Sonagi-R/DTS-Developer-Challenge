package com.dts.taskit_be.controllers;

import com.dts.taskit_be.models.Task;
import com.dts.taskit_be.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("/task/create")
    ResponseEntity<Task> createTask(@RequestBody Task newTask){
        return ResponseEntity.ok(newTask);
    }

    @GetMapping("/task/{id}")
    ResponseEntity<Task> getTask(@PathVariable String id){
        return ResponseEntity.ok(taskService.getTask(id));
    }

    @GetMapping("/task/getAll")
    ResponseEntity<List<Task>> getAllTasks(){
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping("/task/update/{id}")
    ResponseEntity<Task> updateTask(@RequestBody Task taskUpdate, @PathVariable String id){
        return ResponseEntity.ok(taskService.updateTask(id, taskUpdate));
    }

    @DeleteMapping("/task/delete/{id}")
    ResponseEntity<Boolean> deleteTask(@PathVariable String id){
       return ResponseEntity.ok(taskService.deleteTask(id));
    }
}
