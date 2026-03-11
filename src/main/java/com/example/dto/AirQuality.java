package com.example.dto;

import com.google.gson.annotations.SerializedName;

public class AirQuality {
    private Double co;
    private Double no2;
    private Double o3;
    private Double so2;
    private Double pm2_5;
    private Double pm10;
    @SerializedName("us-epa-index")
    private Integer usEpaIndex;
    @SerializedName("gb-defra-index")
    private Integer gbDefraIndex;
}
