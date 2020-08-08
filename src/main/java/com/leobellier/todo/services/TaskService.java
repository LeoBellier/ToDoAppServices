package com.leobellier.todo.services;

import com.leobellier.todo.model.entity.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();

    public Optional<Task> findById(int id) {
        return this.tasks.stream().filter(task -> task.getId() == id).findFirst();
    }

    {
        tasks.add(new Task(1, "task", 1, "Learn React", new Date(), false));
        tasks.add(new Task(2, "task", 1, "Learn Spring", new Date(), false));
        tasks.add(new Task(3, "task", 1, "Learn Docker", new Date(), false));
        tasks.add(new Task(4, "task", 1, "Learn AOP", new Date(), false));
    }

    public List<Task> getTasks(int userId) {
        return this.tasks;
    }

    public Task deleteTaskById(int taskId) {
        Optional<Task> task = this.findById(taskId);
        task.ifPresent(value -> tasks.remove(value));
        return task.orElse(null);
    }
}
