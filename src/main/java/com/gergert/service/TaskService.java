package com.gergert.service;

import com.gergert.entity.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        System.out.println("--- ADD NEW TASK ---");

        Task newTask = new Task(description);
        tasks.add(newTask);
        System.out.println("Success: Added task:" + newTask.getDescription() + " with id: " + newTask.getId());
    }

    public void printAllTasks() {
        System.out.println("--- YOUR TASKS ---");

        if (tasks.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            for (Task task : tasks) {
                System.out.println(task.toString());
            }
        }
    }

    public void deleteTask(int id) {
        System.out.println("--- REMOVE TASK ---");

        Task taskToRemove = null;

        for (Task task : tasks) {
            if (task.getId() == id) {
                taskToRemove = task;
                break;
            }
        }

        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            System.out.println("Task with ID " + id + " deleted.");
        } else {
            System.out.println("Task with ID " + id + " not found!");
        }
    }



}
