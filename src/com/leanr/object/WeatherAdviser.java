package com.leanr.object;

public class WeatherAdviser {
    public String provideWeatherAdvisory(int temperature) {
        // TODO: Provide a weather advisory message based on the temperature.
        if (temperature > 20){
            return "It's warm! Enjoy the day.";

        }else if (temperature >=11 ){
            return "It's cool! A light jacket will do.";
        } else if (temperature >= 0) {
            return "It's cold! Bundle up.";
        }
        else {
            return "It's freezing! Wear a heavy coat.";
        }
    }
}
