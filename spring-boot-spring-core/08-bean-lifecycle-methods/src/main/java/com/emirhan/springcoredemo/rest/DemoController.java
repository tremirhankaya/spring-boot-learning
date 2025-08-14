package com.emirhan.springcoredemo.rest;

import com.emirhan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("footballCoach")Coach myCoach) {

        this.myCoach = myCoach;
        System.out.println("constructor: "+ getClass().getSimpleName()  );

    }
  @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }


}

