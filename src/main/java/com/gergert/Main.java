package com.gergert;


import com.gergert.service.TaskService;

public class Main {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        System.out.println("Welcome to Task Manager!");

        service.addTask("Buy milk");
        service.addTask("Learn Git");

        service.printAllTasks();

        System.out.println("Choose your choice");
        System.out.println("1. View all tasks");
        System.out.println("2. Add new task");
        System.out.println("3. Delete task");

        switch ()
    }

}