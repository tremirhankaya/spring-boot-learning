package com.emirhan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class BasketballCoach implements Coach {

    public String getDailyWorkout() {
        return "Practice 3 point shoot for 15 min!!!!";
    }

}
