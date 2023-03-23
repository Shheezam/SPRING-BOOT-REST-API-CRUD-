package com.example.restapidemo.service;

import com.example.restapidemo.exception.BadRequestException;
import com.example.restapidemo.repository.TaskRepository;
import com.example.restapidemo.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service

public class TaskServiceimpl implements  TaskService{

    @Autowired
    private TaskRepository taskRepository;


    @Override
    public Task save(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public Task update(long id, Task task) {
        task.setId(id);
        return taskRepository.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskRepository.findAll();
    }

    @Override
    public Task findById(long id) {
        return taskRepository.findById(id).orElseThrow(()->new BadRequestException("Task cannot be found"));
    }

    @Override
    public void deleteById(long id) {
        taskRepository.deleteById(id);
    }
}
