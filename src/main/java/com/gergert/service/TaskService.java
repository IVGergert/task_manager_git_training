package com.gergert.service;

import com.gergert.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        tasks.add(new Task(description));
        System.out.println("Success: Task added!");
    }
}
