package com.example.demo.repository;

import com.example.demo.model.Task;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class TaskRepository {

    private List<Task> tasks = new ArrayList<>(Arrays.asList(
            new Task(1, "Task 1", "Description 1", "HIGH", 1),
            new Task(2, "Task 2", "Description 2", "LOW", 2),
            new Task(3, "Task 3", "Description 3", "MEDIUM", 3)
    ));

    public List<Task> findAll() {
        return tasks;
    }

    public void save(Task task) {
        tasks.add(task);
    }
}
