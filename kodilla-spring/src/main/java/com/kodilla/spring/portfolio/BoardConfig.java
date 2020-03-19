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
    TaskList taskList;

    @Autowired
    @Qualifier("inProgressList")
    TaskList taskList1;

    @Autowired
    @Qualifier("doneList")
    TaskList taskList2;

    @Bean
    public Board getBoard(){
        return new Board(taskList, taskList1, taskList2);
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
