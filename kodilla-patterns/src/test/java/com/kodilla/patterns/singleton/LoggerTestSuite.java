package com.kodilla.patterns.singleton;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass
    public static void lastLog() {
        Logger.getInstance().log("My last log test!");
    }

    @AfterClass
    public static void getLastLog() {
        Logger.getInstance().getLastLog();
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String myLastLog = Logger.getInstance().getLastLog();
        System.out.println("My last log is: " + myLastLog);
        //Then
        Assert.assertEquals("My last log test!", myLastLog);
    }

}
