package com.weatherreport;

import com.weatherreport.api.WeatherResponce;
import com.weatherreport.connector.WeatherReportConnector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    public WeatherReportConnector weatherReportConnector;

    @GetMapping("/{city}")
    public ResponseEntity<WeatherResponce> getWeatherReport(@PathVariable("city") String city) {
        WeatherResponce weatherResponce = weatherReportConnector.get(city);
        return new ResponseEntity<>(weatherResponce, HttpStatus.OK);
    }

}
