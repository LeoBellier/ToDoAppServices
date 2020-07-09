package com.leobellier.todo.controller;

import com.leobellier.todo.model.UserBean;
import com.leobellier.todo.model.entity.Task;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/rest")
@CrossOrigin(origins = "*")
public class UserController {
    @GetMapping(path = "/username")
    public String username() {
        return "Hi";
    }

    @GetMapping(path = "/user")
    public UserBean user() {
        return new UserBean("LeoBellier", "Leo");
    }


}
