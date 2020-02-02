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
        public void testCalculate() {

            //Given
            Statistics statisticsMock = mock(Statistics.class);
            CalculateStatistics newCalculation = new CalculateStatistics(statisticsMock);

            List<String> usersList = new ArrayList<String>();
            usersList.add("Tomasz1");
            usersList.add("Tomasz2");
            usersList.add("Tomasz3");
            usersList.add("Tomasz4");
            usersList.add("Tomasz5");
            usersList.add("Tomasz6");

            when(statisticsMock.usersNames()).thenReturn(usersList);


            //When
            int usersQuantity = usersList.size();

            //Then
            Assert.assertEquals(6, statisticsMock.usersNames().size());
        }

        /*@Test
        public void testGetPost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            ForumPost retrievedPost;
            retrievedPost = forumUser.getPost(0);

            //Then
            Assert.assertEquals(thePost, retrievedPost);
        }

        @Test
        public void testGetComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(),
                    theComment.getCommentBody());

            //When
            ForumComment retrievedComment = forumUser.getComment(0);

            //Then
            Assert.assertEquals(theComment, retrievedComment);
        }

        @Test
        public void testRemovePostNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assert.assertFalse(result);
        }

        @Test
        public void testRemoveCommentNotExisting() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assert.assertFalse(result);
        }

        @Test
        public void testRemovePost() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());

            //When
            boolean result = forumUser.removePost(thePost);

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, forumUser.getPostsQuantity());
        }

        @Test
        public void testRemoveComment() {
            //Given
            ForumUser forumUser = new ForumUser("mrsmith", "John Smith");
            ForumPost thePost = new ForumPost("Hello everyone, " +
                    "this is my first contribution here!", "mrsmith");
            ForumComment theComment = new ForumComment(thePost, "mrsmith",
                    "Thank you for all good words!");
            forumUser.addComment(thePost, theComment.getAuthor(),
                    theComment.getCommentBody());

            //When
            boolean result = forumUser.removeComment(theComment);

            //Then
            Assert.assertTrue(result);
            Assert.assertEquals(0, forumUser.getCommentsQuantity());
        }
*/



}
