package com.practo.config;

import org.springframework.context.Lifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class TimeSlotConfiguration {

    @Bean
    public TimeSlotManager timeSlotManager(){
        List<String> availableTimeSlots= new ArrayList<>();
        availableTimeSlots.add("10:15 AM");
        availableTimeSlots.add("12:15 PM");
        availableTimeSlots.add("5:15 PM");

        return new TimeSlotManager(availableTimeSlots);

    }


}
