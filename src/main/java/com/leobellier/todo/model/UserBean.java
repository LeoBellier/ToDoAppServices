package com.leobellier.todo.model;

public class UserBean {
    private String username;
    private String name;
    public UserBean(String username, String name) {
        this.username = username;
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserBean{" +
                "username= [username=%s], name=[user=%s]" +
                "}";
    }
}
