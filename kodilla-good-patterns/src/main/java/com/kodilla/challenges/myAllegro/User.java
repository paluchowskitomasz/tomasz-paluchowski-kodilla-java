package com.kodilla.challenges.myAllegro;

import java.util.Objects;

public class User {

    private String userName;
    private String userLastName;
    private String userPESEL;



    public User(String userName, String userLastName, String userPESEL) {
        this.userName = userName;
        this.userLastName = userLastName;
        this.userPESEL = userPESEL;

    }

    public String getUserName() {
        return userName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserPESEL() {
        return userPESEL;
    }

}
