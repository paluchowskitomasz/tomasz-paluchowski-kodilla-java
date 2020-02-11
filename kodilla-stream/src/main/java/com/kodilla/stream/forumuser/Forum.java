package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> theUserList = new ArrayList<ForumUser>();

    public List<ForumUser> getUserList(){



        theUserList.add(new ForumUser(1,"Tomasz1",'m', LocalDate.of(2000, 12, 1), 10));
        theUserList.add(new ForumUser(2,"Tomasz2",'m',LocalDate.of(1995, 9, 6), 20));
        theUserList.add(new ForumUser(3,"Tomasz3",'m',LocalDate.of(1990, 7, 11), 30));
        theUserList.add(new ForumUser(4,"Tomasz4",'f',LocalDate.of(1985, 5, 16), 40));
        theUserList.add(new ForumUser(5,"Tomasz5",'f',LocalDate.of(1980, 3, 21), 50));
        theUserList.add(new ForumUser(6,"Tomasz6",'f',LocalDate.of(1875, 1, 26), 60));
        theUserList.add(new ForumUser(7,"Tomasz7",'f',LocalDate.of(1970, 12, 31), 70));

        return theUserList;

    }

}
