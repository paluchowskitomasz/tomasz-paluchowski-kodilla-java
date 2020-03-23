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
        String taskToDoNameBoard = board.getToDoList().getTasks().get(0).toString();
        String taskInProgressNameBoard = board.getInProgressList().getTasks().get(0).toString();
        String taskDoneNameBoard = board.getDoneList().getTasks().get(0).toString();

        //Then
        Assert.assertTrue(taskToDoNameBoard.contains("To do list - task 1"));
        Assert.assertTrue(taskInProgressNameBoard.contains("In progress list - task 1"));
        Assert.assertTrue(taskDoneNameBoard.contains("Done list - task 1"));
    }

}


