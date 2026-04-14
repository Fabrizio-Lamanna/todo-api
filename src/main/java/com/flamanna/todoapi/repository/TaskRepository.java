package com.flamanna.todoapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flamanna.todoapi.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}