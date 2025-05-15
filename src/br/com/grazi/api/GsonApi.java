package br.com.grazi.api;

import br.com.grazi.model.Weather;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonApi {
    private final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public void GsonWeather(String response){
        WeatherParams weatherParams = gson.fromJson(response, WeatherParams.class);

        Weather weather = new Weather(weatherParams);
        System.out.println(weather);
    }
}
