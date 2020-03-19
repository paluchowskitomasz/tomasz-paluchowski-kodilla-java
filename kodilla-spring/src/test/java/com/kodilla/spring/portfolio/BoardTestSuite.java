package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class BoardTestSuite {

    @Test
    public void  testTaskAdd(){

        //Given

        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("To do list - task 1");
        board.getInProgressList().addTask("In progress list - task 1");
        board.getDoneList().addTask("Done list - task 1");

        //When
        boolean toDoListExists= context.containsBean("toDoList");
        boolean inProgressListExists= context.containsBean("inProgressList");
        boolean doneListExists= context.containsBean("doneList");

        //Then
        Assert.assertTrue("To do list - without task! " + board.getToDoList(),
                board.getToDoList().getTasks().contains("To do list - task 1"));
        Assert.assertTrue("In progress list - without tasks! " + board.getToDoList(),
                board.getInProgressList().getTasks().contains("In progress list - task 1"));
        Assert.assertTrue("Done list - without tasks! " + board.getToDoList(),
                board.getDoneList().getTasks().contains("Done list - task 1"));
    }

}


