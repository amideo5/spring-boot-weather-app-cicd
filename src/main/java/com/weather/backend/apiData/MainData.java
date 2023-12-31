package com.weather.backend.apiData;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
public class MainData {
    @SerializedName("temp")
    private double temperature;
    @SerializedName("humidity")
    private double humidity;
}
