package com.example.restapidemo.repository;

import com.example.restapidemo.task.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
