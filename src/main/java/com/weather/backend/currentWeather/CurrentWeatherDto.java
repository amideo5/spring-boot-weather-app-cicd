package com.weather.backend.currentWeather;

import com.weather.backend.apiData.MainData;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class CurrentWeatherDto {

    private MainData mainData;

}
