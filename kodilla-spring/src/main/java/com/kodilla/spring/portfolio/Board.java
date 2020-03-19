package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;

import java.util.List;

public class Board {

    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public void showListOfTasks() {
        System.out.println("List of tasks: " + toDoList.getTasks());
        System.out.println("List of tasks: " + inProgressList.getTasks());
        System.out.println("List of tasks: " + doneList.getTasks());
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
