package com.example.demo.model;

public class Task {

    private int id;
    private String title;
    private String description;
    private String priority;
    private String assignedTo;

    public Task(int id, String title, String description,
                String priority, String assignedTo) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.assignedTo = assignedTo;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getAssignedTo() {
        return assignedTo;
    }
}
