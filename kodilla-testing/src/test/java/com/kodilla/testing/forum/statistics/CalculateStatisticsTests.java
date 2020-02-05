package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateStatisticsTests {

        private static int testCounter = 0;

        @BeforeClass
        public static void beforeAllTests() {
            System.out.println("This is the beginning of tests.");
        }

        @AfterClass
        public static void afterAllTests() {
            System.out.println("All tests are finished.");
        }

        @Before
        public void beforeEveryTest() {
            testCounter++;
            System.out.println("Preparing to execute test #" + testCounter);
        }

        @Test
        public void testPostAveragePerUser() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 0;
            int commentQuantity = 150;
            List<String> usersList = new ArrayList<String>();
            for(int i =0; i < 100; i++ ){

                usersList.add("Tomasz" + i);

            }

            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(postQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

            //When
            newCalculation.calculateAdvStatistics();
            double postAveragePerUser = newCalculation.getPostAveragePerUser();

            //Then
            Assert.assertEquals(0, postAveragePerUser,0.00001);
        }

        @Test
        public void testCalculateUserSecond() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 0;
            int commentQuantity = 150;
            List<String> usersList = new ArrayList<String>();

            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(postQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

            //When
            newCalculation.calculateAdvStatistics();
            double postAveragePerUser = newCalculation.getPostAveragePerUser();

            //Then
            Assert.assertEquals(0, postAveragePerUser,0);
        }

        /*@Test
        public void testCalculatePostFirst() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postNumber = 0;
            when(statisticsMock.postsCount()).thenReturn(postNumber);

            //When
            int postQuantity = postNumber;

            //Then
            Assert.assertEquals(0, postQuantity);
        }

        @Test
        public void testCalculatePostSecond() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postNumber = 1000;
            when(statisticsMock.postsCount()).thenReturn(postNumber);

            //When
            int postQuantity = postNumber;

            //Then
            Assert.assertEquals(1000, postQuantity);
        }

       @Test
        public void testCalculateCommentFirst() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int commentNumber = 0;
            when(statisticsMock.commentsCount()).thenReturn(commentNumber);

            //When
            int commentQuantity = commentNumber;

            //Then
            Assert.assertEquals(0, commentQuantity);
        }

    @Test
    public void testCalculateCommentSecond() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

        int postNumber = 1000;
        int commentNumber = 0;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        //When
        int postQuantity = postNumber;
        int commentQuantity = commentNumber;

        //Then
        Assert.assertTrue(commentQuantity < postQuantity);
    }

    @Test
    public void testCalculateCommentThird() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

        int postNumber = 0;
        int commentNumber = 1000;
        when(statisticsMock.postsCount()).thenReturn(postNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentNumber);

        //When
        int postQuantity = postNumber;
        int commentQuantity = commentNumber;

        //Then
        Assert.assertTrue( commentQuantity > postQuantity);
    }*/





}
