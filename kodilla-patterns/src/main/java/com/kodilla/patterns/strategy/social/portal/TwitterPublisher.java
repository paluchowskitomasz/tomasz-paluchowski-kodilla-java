package com.kodilla.patterns.strategy.social.portal;

import com.kodilla.patterns.strategy.social.SocialPublisher;

public class TwitterPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "I am Twitter Publisher!";
    }
}
