package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.Reader;
import com.kodilla.spring.reader.ReaderConfig;
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

        board.getToDoList().addTask("test");




        //When & Then
        board.showListOfTasks();

    }

}


