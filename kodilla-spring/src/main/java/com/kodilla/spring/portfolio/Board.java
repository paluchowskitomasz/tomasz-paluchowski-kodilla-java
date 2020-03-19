package com.kodilla.spring.portfolio;

import javafx.concurrent.Task;

import java.util.List;

public class Board {

    TaskList list;

    public Board(TaskList list) {
        this.list = list;
    }

    List<TaskList> toDoList;
    List<TaskList> inProgressList;
    List<TaskList> doneList;

    public void showListOfTasks() {
        System.out.println("List of tasks: " + list.getTasks());
    }


}
