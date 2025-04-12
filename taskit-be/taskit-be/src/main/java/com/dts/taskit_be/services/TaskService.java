package com.dts.taskit_be.services;

import com.dts.taskit_be.models.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    public Task getTask(String id){
        return Task.builder().title("mock task").build();
    }

    public List<Task> getAllTasks(){
        List<Task> myList = new ArrayList<>();
        Task taskOne = Task.builder().title("mock task").build();
        Task taskTwo = Task.builder().title("mock task 2").build();
        myList.add(taskOne);
        myList.add(taskTwo);

        return myList;
    }

    public Task updateTask(String id, Task taskUpdate){
        //get task by id
        //update any non null values
        //save task to db and return to fe
        Task oldTask = Task.builder().title("mock task").build();
        return oldTask;
    }

    public Boolean deleteTask(String id){
        return true;
    }
}
