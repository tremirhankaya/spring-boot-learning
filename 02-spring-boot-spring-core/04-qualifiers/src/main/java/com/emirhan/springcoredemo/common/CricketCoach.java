package com.emirhan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {
    public String getDailyWorkout() {
        return "Cricket";
    }
}
