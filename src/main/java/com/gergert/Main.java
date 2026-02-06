package com.gergert;

import com.gergert.service.TaskService;

import java.util.Scanner;

public class Main {
    private static final TaskService taskService = new TaskService();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true){
            System.out.println("1. Add new task");
            System.out.println("2. Show all tasks");
            System.out.println("3. Delete task by ID");
            System.out.println("0. Exit");
            System.out.println("Select option:");

            int command = scanner.nextInt();

            switch (command) {
                case 1 -> {
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    taskService.addTask(description);
                }
                case 2 -> taskService.printAllTasks();
                case 3 -> {
                    System.out.print("Enter ID to delete: ");
                    int id = scanner.nextInt();
                    taskService.deleteTask(id);
                }
                case 0 -> System.exit(0);
                default -> System.out.println("Unknown command. Please try again.");
            }
        }
    }

}