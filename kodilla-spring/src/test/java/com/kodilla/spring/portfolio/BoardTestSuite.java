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

        TaskList toDoList = context.getBean("toDoList",TaskList.class);
        TaskList inProgressDoList = context.getBean("inProgressList",TaskList.class);
        TaskList doneList = context.getBean("doneList",TaskList.class);


       //When
        board.getToDoList().addTask("To do list - task 1");
        board.getInProgressList().addTask("In progress list - task 1");
        board.getDoneList().addTask("Done list - task 1");
        
        String taskToDoNameBoard = board.getToDoList().getTasks().toString();
        String taskInProgressNameBoard = board.getInProgressList().getTasks().toString();
        String taskDoneNameBoard = board.getDoneList().getTasks().toString();

        String toDoFromTaskBean = toDoList.getTasks().toString();
        String inProgressFromTaskBean = inProgressDoList.getTasks().toString();
        String doneFromTaskBean = doneList.getTasks().toString();

        //Then
        Assert.assertEquals(taskToDoNameBoard, toDoFromTaskBean);
        Assert.assertEquals(taskInProgressNameBoard, inProgressFromTaskBean);
        Assert.assertEquals(taskDoneNameBoard, doneFromTaskBean);
    }

}


