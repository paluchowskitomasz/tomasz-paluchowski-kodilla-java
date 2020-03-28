package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import com.kodilla.patterns.strategy.predictors.AggressivePredictor;
import com.kodilla.patterns.strategy.social.portal.TwitterPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new Millenials("Tomasz Millenials");
        User user2 = new YGeneration("Mariusz YGeneration");
        User user3 = new ZGeneration("Magda ZGeneration");

        //When
        String tomaszDefaultFacebookPublisher = user1.sharePost();
        System.out.println("Tomasz Millenials: " + tomaszDefaultFacebookPublisher);
        String mariuszDefaultTwitterPublisher = user2.sharePost();
        System.out.println("Mariusz YGeneration: " + mariuszDefaultTwitterPublisher);
        String magdaDefaultSnapchatPublisher = user3.sharePost();
        System.out.println("Magda ZGeneration: " + magdaDefaultSnapchatPublisher);

        //Then
        Assert.assertEquals("I am Facebook Publisher!", tomaszDefaultFacebookPublisher);
        Assert.assertEquals("I am Twitter Publisher!", mariuszDefaultTwitterPublisher);
        Assert.assertEquals("I am Snapchat Publisher!", magdaDefaultSnapchatPublisher);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new Millenials("Tomasz Millenials");

        //When
        String tomaszChangeFacebookToTwitter = user1.sharePost();
        System.out.println("Tomasz Millenials: " + tomaszChangeFacebookToTwitter);
        user1.setSocialPublisher(new TwitterPublisher());
        tomaszChangeFacebookToTwitter = user1.sharePost();
        System.out.println("Tomasz Millenials change his mind and decide to publish his posts on: " + tomaszChangeFacebookToTwitter);

        //Then
        Assert.assertEquals("I am Twitter Publisher!", tomaszChangeFacebookToTwitter);
    }
}

