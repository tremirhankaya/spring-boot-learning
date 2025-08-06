package com.emirhan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component

public class CricketCoach implements Coach {


    public CricketCoach(){
        System.out.println("constructor: "+ getClass().getSimpleName()  );
    }
    public String getDailyWorkout() {
        return "Cricket";
    }
}
