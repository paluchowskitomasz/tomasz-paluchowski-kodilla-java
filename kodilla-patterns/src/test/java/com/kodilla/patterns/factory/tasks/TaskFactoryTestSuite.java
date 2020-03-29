package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrive() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driveToSomewhere = factory.proceedWithTask("DRIVE");
        driveToSomewhere.executeTask();
        //Then
        Assert.assertEquals("Drive 1", driveToSomewhere.getTaskName());
        Assert.assertEquals(true, driveToSomewhere.isTaskExecuted());

    }

    @Test
    public void testFactoryShop() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task buySomething = factory.proceedWithTask("SHOP");
        //Then
        Assert.assertEquals("Shop 1", buySomething.getTaskName());
        Assert.assertEquals(false, buySomething.isTaskExecuted());

    }

    @Test
    public void testFactoryPaint() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task paintSomething = factory.proceedWithTask("PAINT");
        paintSomething.executeTask();
        //Then
        Assert.assertEquals("Paint 1", paintSomething.getTaskName());
        Assert.assertEquals(true, paintSomething.isTaskExecuted());

    }

}
