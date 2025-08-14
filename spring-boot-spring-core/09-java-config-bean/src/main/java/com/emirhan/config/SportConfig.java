package com.emirhan.config;

import com.emirhan.springcoredemo.common.Coach;
import com.emirhan.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    
    @Bean("swimId")
    public Coach swimCoach(){
        return new SwimCoach();
    }
 
}
