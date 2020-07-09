package com.leobellier.todo.model.entity;

import java.util.Date;

//@Entity
public class Task {

    //@Id
    private Integer id;

    // @Column
    private String task;

    private Integer userId;

    private String description;

    private Date targetDate;

    private boolean isDone;

    public Task(Integer id, String task, Integer userId, String description, Date targetDate, boolean isDone) {
        this.id = id;
        this.task = task;
        this.userId = userId;
        this.description = description;
        this.targetDate = targetDate;
        this.isDone = isDone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task1 = (Task) o;

        if (isDone != task1.isDone) return false;
        if (!id.equals(task1.id)) return false;
        if (task != null ? !task.equals(task1.task) : task1.task != null) return false;
        if (userId != null ? !userId.equals(task1.userId) : task1.userId != null) return false;
        if (description != null ? !description.equals(task1.description) : task1.description != null) return false;
        return targetDate != null ? targetDate.equals(task1.targetDate) : task1.targetDate == null;
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (task != null ? task.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (targetDate != null ? targetDate.hashCode() : 0);
        result = 31 * result + (isDone ? 1 : 0);
        return result;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
