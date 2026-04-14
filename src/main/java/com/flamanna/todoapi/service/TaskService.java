package com.flamanna.todoapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.flamanna.todoapi.entity.Task;
import com.flamanna.todoapi.repository.TaskRepository;

@Service
public class TaskService {

    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }
}