package com.weather.backend.currentWeather;

import org.springframework.stereotype.Component;

import java.util.Optional;


@Component
public class CurrentWeatherDtoMapper {

    public CurrentWeatherDto mapToCurrentWeatherDTO(CurrentWeather currentWeather){
        return new CurrentWeatherDto(
                currentWeather.getMain()
        );
    }
}
