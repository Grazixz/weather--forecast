package br.com.grazi.api;

public class WeatherApi {
    private final KeyApi key = new KeyApi();

    private String urlBase = "http://api.weatherapi.com/v1/current.json?";

    public String getUrlBase() {
        return urlBase;
    }

    public void updateUrl(String local){
        urlBase = "http://api.weatherapi.com/v1/current.json?" + key.getKey() + local + "&lang=pt";
    }
}
