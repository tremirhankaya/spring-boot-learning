package com.emirhan.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class FootballCoach implements Coach {
    public  FootballCoach(){
        System.out.println("constructor: "+ getClass().getSimpleName()  );
    }
    @Override
    public String getDailyWorkout() {
        return "Practice 5 penalty kick";
    }

    //init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("doMyStartupStuff: "+ getClass().getSimpleName());

    }
    //destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("doMyCleanupStuff: "+ getClass().getSimpleName());

    }


}
