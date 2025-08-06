package com.emirhan.springcoredemo.common;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@Lazy
public class BasketballCoach implements Coach {

    public  BasketballCoach(){
        System.out.println("constructor: "+ getClass().getSimpleName()  );
    }


    public String getDailyWorkout() {
        return "Practice 3 point shot for 15 min!!!!";
    }

}
