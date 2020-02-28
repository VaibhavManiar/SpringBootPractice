package com.weatherreport.connector;

import com.weatherreport.api.WeatherResponce;

public interface WeatherReportConnector {
    WeatherResponce get(String cityName);
}
