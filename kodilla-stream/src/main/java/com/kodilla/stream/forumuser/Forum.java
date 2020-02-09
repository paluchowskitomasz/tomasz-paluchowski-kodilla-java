package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<ForumUser>();

    ForumUser newUser1 = new ForumUser(1,"Tomasz1",'m', LocalDate.of(2000, 12, 1), 10);
    ForumUser newUser2 = new ForumUser(2,"Tomasz2",'m',LocalDate.of(1995, 9, 6), 20);
    ForumUser newUser3 = new ForumUser(3,"Tomasz3",'m',LocalDate.of(1990, 7, 11), 30);
    ForumUser newUser4 = new ForumUser(4,"Tomasz4",'f',LocalDate.of(1985, 5, 16), 40);
    ForumUser newUser5 = new ForumUser(5,"Tomasz5",'f',LocalDate.of(1980, 3, 21), 50);
    ForumUser newUser6 = new ForumUser(6,"Tomasz6",'f',LocalDate.of(1875, 1, 26), 60);
    ForumUser newUser7 = new ForumUser(7,"Tomasz7",'f',LocalDate.of(1970, 12, 31), 70);

    public void userAdd(){

        theUserList.add(newUser1);
        theUserList.add(newUser2);
        theUserList.add(newUser3);
        theUserList.add(newUser4);
        theUserList.add(newUser5);
        theUserList.add(newUser6);
        theUserList.add(newUser7);

    }

    public List<ForumUser> getUserList(){
        return new ArrayList<>(theUserList);

    }


}
