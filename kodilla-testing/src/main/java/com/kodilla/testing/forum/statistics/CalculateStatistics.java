package com.kodilla.testing.forum.statistics;

public class CalculateStatistics {

    Statistics statistics;

    public CalculateStatistics (Statistics statistics) {
        this.statistics = statistics;
    }

    double userQuantity;
    double postQuantity;
    double commentsQuantity;
    double postAveragePerUser;
    double commentsAveragePerUser;
    double postCommentsAverage;

    public double getUserQuantity() {
        return userQuantity;
    }

    public double getPostQuantity() {
        return postQuantity;
    }

    public double getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostAveragePerUser() {
        return postAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getPostCommentsAverage() {
        return postCommentsAverage;
    }


    public void calculateAdvStatistics() {

        double userQuantity = statistics.usersNames().size();
        double postQuantity = statistics.postsCount();
        double commentsQuantity = statistics.commentsCount();

        if(userQuantity > 0) {postAveragePerUser = postQuantity / userQuantity;
        } else {System.out.println("Number of users is 0!");};

        if(userQuantity > 0) {commentsAveragePerUser = commentsQuantity / userQuantity;
        } else {System.out.println("Number of users is 0!");};

        if (postQuantity > 0) {postCommentsAverage = commentsQuantity / postQuantity;
        } else {System.out.println("Number of posts is 0!");};

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
