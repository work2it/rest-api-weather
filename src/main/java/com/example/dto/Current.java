package com.example.dto;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Current {
    @SerializedName("last_updated_epoch")
    private String lastUpdatedEpoch;
    @SerializedName("last_updated")
    private String lastUpdated;
    @SerializedName("temp_c")
    private Double tempC;
    @SerializedName("temp_f")
    private Double tempF;
    @SerializedName("is_day")
    private Integer isDay;
    private Condition condition;
    @SerializedName("windMph")
    private Double wind_mph;
    @SerializedName("windKph")
    private Double wind_kph;
    @SerializedName("windDegree")
    private Double wind_degree;
    @SerializedName("wind_dir")
    private String windDir;
    @SerializedName("pressure_mb")
    private Double pressureMb;
    @SerializedName("pressure_in")
    private Double pressureIn;
    @SerializedName("precip_mm")
    private Double precipMm;
    @SerializedName("precip_in")
    private Double precipIn;
    private Double humidity;
    private Double cloud;
    @SerializedName("feelslike_c")
    private Double feelslikeC;
    @SerializedName("feelslike_f")
    private Double feelslikeF;
    @SerializedName("windchill_c")
    private Double windchillC;
    @SerializedName("windchill_f")
    private Double windchillF;
    @SerializedName("heatindex_c")
    private Double heatindexC;
    @SerializedName("heatindex_f")
    private Double heatindexF;
    @SerializedName("dewpoint_c")
    private Double dewpointC;
    @SerializedName("dewpoint_f")
    private Double dewpointF;
    @SerializedName("vis_km")
    private Double visKm;
    @SerializedName("vis_miles")
    private Double visMiles;
    private Double uv;
    @SerializedName("gust_mph")
    private Double gustMph;
    @SerializedName("gust_kph")
    private Double gustKph;
    @SerializedName("air_quality")
    private AirQuality airQuality;
    @SerializedName("short_rad")
    private Double shortRad;
    @SerializedName("diff_rad")
    private Double diffRad;
    private Double dni;
    private Double gti;
}
