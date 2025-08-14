package com.emirhan.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
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
