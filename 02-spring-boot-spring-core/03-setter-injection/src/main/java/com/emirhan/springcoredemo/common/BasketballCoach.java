package com.emirhan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    public String getDailyWorkout() {
        return "Practice 3 point shoot for 15 min!!!!";
    }

}
