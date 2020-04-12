package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.task.dao.TaskDao;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Test: First list name";

    @Test
    public void testFindByListName(){

        //Given
        TaskList taskList = new TaskList(LISTNAME, "New task on the list!");
        taskListDao.save(taskList);
        int id = taskList.getId();

        //When
        List<TaskList> readListName = taskListDao.findByListName("Test: First list name");

        //Then
        Assert.assertEquals(1, readListName.size());

        //CleanUp
        taskListDao.deleteById(id);
    }
}
