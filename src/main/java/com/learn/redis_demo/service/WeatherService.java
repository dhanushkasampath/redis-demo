package com.learn.redis_demo.service;

import com.learn.redis_demo.entity.Weather;
import com.learn.redis_demo.repository.WeatherRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherService {
    private final WeatherRepository weatherRepository;

    public WeatherService(WeatherRepository weatherRepository) {
        this.weatherRepository = weatherRepository;
    }

    public String getWeatherByCity(String city) {
        System.out.println("Fetching Data from DB for city: " + city);
        Optional<Weather> weather = weatherRepository.findByCity(city);
        return weather.map(Weather::getForecast).orElse("Weather data not available");
    }
}
