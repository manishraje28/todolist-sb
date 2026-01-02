package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping; 


@Controller
public class TaskController {
    private final TaskService taskService; 

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("")
    public String getTask(Model model) {
        List<Task> tasks= taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
