package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {

    private final int userID;
    private final String userName;
    private final char userGender;
    private final LocalDate userDateOfBirth;
    private final int postCount;

    public ForumUser(final int userID, final String userName, final char userGender, final LocalDate userDateOfBirth, final int postCount) {
        this.userID = userID;
        this.userName = userName;
        this.userGender = userGender;
        this.userDateOfBirth = userDateOfBirth;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getUserGender() {
        return userGender;
    }

    public LocalDate getUserDateOfBirth() {
        return userDateOfBirth;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userGender=" + userGender +
                ", userDateOfBirth=" + userDateOfBirth +
                ", postCount=" + postCount +
                '}';
    }
}
