package com.emirhan.springcoredemo.rest;

import com.emirhan.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;
    private Coach myCoach2;
    @Autowired
    public DemoController(@Qualifier("footballCoach") Coach myCoach,@Qualifier("footballCoach") Coach myCoach2) {

        this.myCoach = myCoach;
        this.myCoach2 = myCoach2;
        System.out.println("constructor: "+ getClass().getSimpleName()  );

    }
  @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }

@GetMapping("/check")
    public String check() {
        return "Comparing beans: myCoach == myCoach2, "+(myCoach==myCoach2);
}
}

