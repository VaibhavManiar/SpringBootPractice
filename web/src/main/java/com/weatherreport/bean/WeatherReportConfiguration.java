package com.weatherreport.bean;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.weatherreport.connector.openweather.OpenWeatherConnector;
import com.weatherreport.connector.WeatherReportConnector;
import com.weatherreport.util.JettyRestUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WeatherReportConfiguration {

    @Bean("weatherReportConnector")
    public WeatherReportConnector getWeatherReportConnector(JettyRestUtil jettyRestUtil) {
        return new OpenWeatherConnector(jettyRestUtil);
    }

    @Bean("jettyRestUtil")
    public JettyRestUtil getJettyRestUtil(ObjectMapper mapper) {
        return new JettyRestUtil(mapper, 10, 1000, 10000, 10);
    }
}
