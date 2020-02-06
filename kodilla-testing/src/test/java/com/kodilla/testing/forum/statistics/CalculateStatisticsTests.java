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
        public void testPostFirst() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 1000;
            int commentQuantity = 100;
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
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(10, postAveragePerUser,0.00001);
            Assert.assertEquals(1, commentsAveragePerUser,0.00001);
            Assert.assertEquals(0.1, postCommentsAverage,0.00001);
        }

        @Test
        public void testPostSecond() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 0;
            int commentQuantity = 100;
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
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(0, postAveragePerUser,0.00001);
            Assert.assertEquals(1, commentsAveragePerUser,0.00001);
            Assert.assertEquals(0, postCommentsAverage,0.00001);
        }

        @Test
        public void testCommentFirst() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 100;
            int commentQuantity = 0;
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
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(1, postAveragePerUser,0.00001);
            Assert.assertEquals(0, commentsAveragePerUser,0.00001);
            Assert.assertEquals(0, postCommentsAverage,0.00001);
        }


        @Test
        public void testCommentSecond() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 100;
            int commentQuantity = 10;
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
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(1, postAveragePerUser,0.00001);
            Assert.assertEquals(0.1, commentsAveragePerUser,0.00001);
            Assert.assertEquals(0.1, postCommentsAverage,0.00001);
        }

        @Test
        public void testCommentThird() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 10;
            int commentQuantity = 100;
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
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(0.1, postAveragePerUser,0.00001);
            Assert.assertEquals(1, commentsAveragePerUser,0.00001);
            Assert.assertEquals(10, postCommentsAverage,0.00001);
        }

        @Test
        public void testUserFirst() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            int postQuantity = 0;
            int commentQuantity = 0;
            List<String> usersList = new ArrayList<String>();

            when(statisticsMock.usersNames()).thenReturn(usersList);
            when(statisticsMock.postsCount()).thenReturn(postQuantity);
            when(statisticsMock.commentsCount()).thenReturn(commentQuantity);

            //When
            newCalculation.calculateAdvStatistics();
            double postAveragePerUser = newCalculation.getPostAveragePerUser();
            double commentsAveragePerUser = newCalculation.getCommentsAveragePerUser();
            double postCommentsAverage = newCalculation.getPostCommentsAverage();

            //Then
            Assert.assertEquals(0, postAveragePerUser,0.00001);
            Assert.assertEquals(0, commentsAveragePerUser,0.00001);
            Assert.assertEquals(0, postCommentsAverage,0.00001);
        }

}
