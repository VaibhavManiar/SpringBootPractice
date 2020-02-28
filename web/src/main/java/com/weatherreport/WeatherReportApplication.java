package com.weatherreport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.weatherreport")
public class WeatherReportApplication {
    public static void main(String[] args) {
        SpringApplication.run(me.practice.springboot.SpringBootPracticeApplication.class, args);
    }
}