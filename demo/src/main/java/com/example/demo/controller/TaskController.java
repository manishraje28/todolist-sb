package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;

import com.example.demo.models.Task;
import com.example.demo.services.TaskService;
 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
// @RequestMapping("/tasks")
public class TaskController {
    private final TaskService taskService; 

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public String getTask(Model model) {
        List<Task> tasks= taskService.getAllTasks();
        model.addAttribute("tasks", tasks);
        return "tasks";
    }
}
