package com.leobellier.todo.controller;


import com.leobellier.todo.model.entity.Task;
import com.leobellier.todo.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.POST, RequestMethod.GET, RequestMethod.DELETE, RequestMethod.PUT})
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping("/users/{userId}/tasks")
    public List<Task> getAllTask(@PathVariable int userId) {
        return taskService.getTasks(userId);
    }

    @DeleteMapping("/users/tasks/d/{taskId}")
    public ResponseEntity<Void> deleteTask(@PathVariable int taskId) {
        if (taskService.deleteTaskById(taskId) != null)
            return ResponseEntity.noContent().build();
        return ResponseEntity.notFound().build();
    }
}
