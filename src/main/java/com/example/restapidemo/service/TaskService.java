package com.example.restapidemo.service;

import com.example.restapidemo.task.Task;

import java.util.List;

public interface TaskService {
    Task save(Task task);
    Task update(long id, Task task);
    List<Task>findAll();
    Task findById(long id);
    void deleteById(long id);
}
