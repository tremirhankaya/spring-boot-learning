package com.emirhan.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements  Coach{
    public  BaseballCoach(){
        System.out.println("constructor: "+ getClass().getSimpleName()  );
    }

    @Override
    public String getDailyWorkout() {
        return "Baseball coach!";
    }
}
