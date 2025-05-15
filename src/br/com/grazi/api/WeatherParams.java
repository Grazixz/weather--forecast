package br.com.grazi.api;

public class WeatherParams {
    private Location location;
    private Current current;


    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
    }

    public record Location(String name, String region, String country, String lat, String lon,
                           String localtime){
    }

    public record Current(Double temp_c, Condition condition, Double wind_kph, int humidity){

    }

    public record Condition(String text){

    }
}

