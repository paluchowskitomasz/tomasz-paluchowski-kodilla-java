package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery =   "select u.FIRSTNAME, u.LASTNAME, count(*) 'Number of posts'\n" +
                            "from users u join posts p on p.USER_ID = u.ID\n" +
                            "group by u.FIRSTNAME, u.LASTNAME\n" +
                            "having count(*) >= 2";

        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + " " +
                    rs.getString("LASTNAME") + ", " +
                    rs.getInt("Number of posts"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}
