package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskList {

    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>(Arrays.asList("test","test2", "test3"));
    }

    public void addTask(String name){
        tasks.add(name);
    }
    public List<String> getTasks() {
        return tasks;
    }
}
