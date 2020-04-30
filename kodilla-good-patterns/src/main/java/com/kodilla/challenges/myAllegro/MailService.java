package com.kodilla.challenges.myAllegro;

public class MailService implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("MailService will sent a message to user: " + user.getUserLastName() + " " + user.getUserName());
    }
}
