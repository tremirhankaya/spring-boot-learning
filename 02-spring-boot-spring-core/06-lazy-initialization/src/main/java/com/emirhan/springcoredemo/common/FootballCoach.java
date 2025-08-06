package com.emirhan.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
public class FootballCoach implements Coach {
    public  FootballCoach(){
        System.out.println("constructor: "+ getClass().getSimpleName()  );
    }
    @Override
    public String getDailyWorkout() {
        return "Practice 5 penalty kick";
    }
}
