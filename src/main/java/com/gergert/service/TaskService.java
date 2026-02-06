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

    public void printAllTasks() {
        System.out.println("--- YOUR TASKS ---");

        for (Task task : tasks) {
            System.out.println(task.toString());
        }
    }

    public void deleteTaskById(int id) {
        System.out.println("--- Delete TASK ---");

        Task taskToRemove = null;
        for (Task task : tasks){
            if (task.getId() == id){
                taskToRemove = task;
                break;
            }
        }

        if (taskToRemove != null){
            tasks.remove(id);
            System.out.println("Task with ID " + id + " deleted.");
        } else {
            System.out.println("Task with ID " + id + " not found!");
        }
    }
}
