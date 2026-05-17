package com.learn.redis_demo.controller;

import com.learn.redis_demo.entity.Weather;
import com.learn.redis_demo.repository.WeatherRepository;
import com.learn.redis_demo.service.WeatherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weather")
public class WeatherController {


    private final WeatherService weatherService;
    private final WeatherRepository weatherRepository;

    public WeatherController(WeatherService weatherService, WeatherRepository weatherRepository) {
        this.weatherService = weatherService;
        this.weatherRepository = weatherRepository;
    }

    @GetMapping
    public String getWeather(@RequestParam String city){
        return weatherService.getWeatherByCity(city);
    }

    @PostMapping
    public Weather addWeather(@RequestBody Weather weather){
        return weatherRepository.save(weather);
    }

    @GetMapping("/all")
    public List<Weather> getAllWeather(){
        return weatherRepository.findAll();
    }
}
