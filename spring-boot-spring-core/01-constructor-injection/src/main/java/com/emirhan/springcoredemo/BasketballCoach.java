package com.emirhan.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public String getDailyWorkout() {
        return "Practice 3point shoot for 15 min!!!!";
    }

}
