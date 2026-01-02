package com.example.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.Task;
import com.example.demo.repository.TaskRespository;

@Service
public class TaskService {

    private final TaskRespository taskRespository;

    public TaskService(TaskRespository taskRespository) {
        this.taskRespository = taskRespository;
    }

    public List<Task> getAllTasks() {
        return taskRespository.findAll();
    }
}
