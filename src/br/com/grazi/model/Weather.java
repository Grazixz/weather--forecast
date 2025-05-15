package br.com.grazi.model;

import br.com.grazi.api.WeatherApi;
import br.com.grazi.api.WeatherParams;

import java.io.IOException;


public class Weather {
    private final WeatherApi weatherApi = new WeatherApi();
    private final Client client = new Client();
    private String name;
    private String region;
    private String country;
    private String localTime;
    private Double temperature;
    private String condition;
    private Double wind;
    private int humidity;

    public Weather() {
    }

    public Weather(WeatherParams weatherParams) {
        this.name = weatherParams.getLocation().name();
        this.region = weatherParams.getLocation().region();
        this.country = weatherParams.getLocation().country();
        this.localTime = weatherParams.getLocation().localtime();
        this.temperature = weatherParams.getCurrent().temp_c();
        this.condition = weatherParams.getCurrent().condition().text();
        this.wind = weatherParams.getCurrent().wind_kph();
        this.humidity = weatherParams.getCurrent().humidity();
    }

    @Override
    public String toString() {
        return  "--------------------------------------\n" +
                "| Previsão do Tempo Em: " + name + " |\n" +
                "| Região: " + region + " |\n" +
                "| País: " + country + " |\n" +
                "| Tempo Local: " + localTime + " |\n" +
                "| Temperatura: " + temperature + "ºC |\n" +
                "| Condição do Tempo: " + condition + " |\n" +
                "| Velocidade do Vento: " + wind + "KM/h |\n" +
                "| Umidade: " + humidity + "% |\n" +
                "--------------------------------------\n";
    }

    public void weatherNow(String name) throws IOException, InterruptedException {
        weatherApi.updateUrl(name);
        client.updateRequest(weatherApi.getUrlBase());
    }
}
