package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    TaskList taskListToDo;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskListInProgress;

    @Autowired
    @Qualifier("doneList")
    TaskList taskDoneList;

    @Bean
    public Board getBoard(){
        return new Board(taskListToDo, taskListInProgress, taskDoneList);
    }

    @Bean(name = "toDoList")
    @Scope("prototype")
    public TaskList taskListToDo(){
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    public TaskList taskListInProgress(){
        return new TaskList();
    }

    @Bean(name = "doneList")
    @Scope("prototype")
    public TaskList taskListDone(){
        return new TaskList();
    }


}
