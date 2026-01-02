package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Task;

public interface TaskRespository extends JpaRepository<Task, Long> {
    
}
