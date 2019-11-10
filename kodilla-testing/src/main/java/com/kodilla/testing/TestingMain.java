package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator addSubscractCalculator = new Calculator();

        int addCheckResult = 4;
        int substractCheckResult = 1;

        int addResult = addSubscractCalculator.add(2,2);
        int substractResult = addSubscractCalculator.substract(3,2);

            if (addResult == addCheckResult) {

                System.out.println("Add - test ok!");

            } else {

                System.out.println("Add - Error!");
            }
            if (substractResult == substractCheckResult) {

                System.out.println("Substract - test ok!");
            } else {

                System.out.println("Substract - Error!");
            }
    }
}