package com.weather.backend.currentWeather;

import com.google.gson.annotations.SerializedName;
import com.weather.backend.apiData.MainData;
import lombok.*;
import org.springframework.stereotype.Component;


@Getter
@Setter
@Component
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrentWeather {

    private Long currentWeatherId;
    @SerializedName("main")
    private MainData main;
}
