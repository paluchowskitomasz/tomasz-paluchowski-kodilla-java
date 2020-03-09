package com.kodilla.challenges.myAllegro;

import java.util.Objects;

public class User {

    String userName;
    String userLastName;
    String userPESEL;



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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return Objects.equals(userPESEL, that.userPESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userPESEL);
    }

    @Override
    public String toString() {
        return "ProductOrderUser{" +
                "userName='" + userName + '\'' +
                ", userLastName='" + userLastName + '\'' +
                ", userPESEL='" + userPESEL + '\'' +
                '}';
    }
}
