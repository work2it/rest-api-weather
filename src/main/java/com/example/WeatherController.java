package com.example;

import com.example.dto.WeatherResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import retrofit2.Response;

import java.io.IOException;

@RestController
public class WeatherController {

    @GetMapping("/")
    public String start() {
        return "OK";
    }

    @GetMapping("/api/v1/weather-in-city")
    public WeatherResponse weatherInCity(@RequestParam(required = false) String query, HttpServletRequest httpServletRequest) {
        String q = query;
        if (q == null) {
           q = httpServletRequest.getRemoteAddr();
        }
        try {
            Response<WeatherResponse> response = Weather.instance().current(Weather.KEY, q).execute();
            return response.body();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
