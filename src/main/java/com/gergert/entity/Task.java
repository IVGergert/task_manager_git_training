package com.gergert.entity;

import java.util.StringJoiner;

public class Task {
    private static int idCounter = 1;

    private int id;
    private String description;
    private boolean isDone;

    public Task(String description) {
        this.id = idCounter++;
        this.description = description;
        this.isDone = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Task.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("description='" + description + "'")
                .add("isDone=" + isDone)
                .toString();
    }
}
