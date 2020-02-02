package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class CalculateStatistics {

    Statistics statistics;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    double userQuantity = 0;
    double postQuantity = 0;
    double commentsQuantity = 0;
    double postAveragePerUser = 0;
    double commentsAveragePerUser = 0;
    double postCommentsAverage = 0;

    public void calculateAdvStatistics() {

        userQuantity = statistics.usersNames().size();
        postQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        postAveragePerUser = postQuantity / userQuantity;
        commentsAveragePerUser = commentsQuantity / userQuantity;
        postCommentsAverage =  commentsQuantity / postCommentsAverage;

    }

    public void showStatistics () {

        System.out.println("User quantity: " + userQuantity);
        System.out.println("Post quantity: " + postQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);

        System.out.println("Post - average per user: " + postAveragePerUser);
        System.out.println("Comments - average per user: " + commentsAveragePerUser);
        System.out.println("Comments - average per post: " + postCommentsAverage);

    }
}
