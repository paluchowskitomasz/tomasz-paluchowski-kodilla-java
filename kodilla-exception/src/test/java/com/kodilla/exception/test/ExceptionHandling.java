package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) {

        SecondChallenge secondChallenge = new SecondChallenge();

        try {

            String result = secondChallenge.probablyIWillThrowException(3, 0);

        } catch(Exception e){

            System.out.println("Problem with method - secondChallenge.probablyIWillThrowException: " + e);

        }


    }

}
