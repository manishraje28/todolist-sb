package com.example.demo.services;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    public void createTask(String title){
        Task task =  new Task();
        task.setTitle(title);
        task.setCompleted(false);
        taskRespository.save(task);
    }
 
    public void deleteTask(Long id) {
       taskRespository.deleteById(id); 
    }


    public void toggleTask(Long id) {
         Task task= taskRespository.findById(id)
         .orElseThrow(() -> new IllegalArgumentException("invalid task id"));
         task.setCompleted(!task.isCompleted());
         taskRespository.save(task);
    }
}
