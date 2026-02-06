package com.gergert;

import com.gergert.service.TaskService;

import java.util.Scanner;

public class Main {
    private static final TaskService taskService = new TaskService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to Task Manager!");

        System.out.println("Choose a response option:");
        System.out.println("1. View all tasks");
        System.out.println("2. Add new task");
        System.out.println("3. Delete task by id");
        int option = scanner.nextInt();



    }

}