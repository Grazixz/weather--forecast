package br.com.grazi.model;

import br.com.grazi.api.GsonApi;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Client {
    private final GsonApi gsonApi = new GsonApi();
    private final HttpClient client = HttpClient.newHttpClient();

    public void updateRequest(String url) throws IOException, InterruptedException {
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url)).build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            gsonApi.GsonWeather(response.body());
        } catch (NullPointerException e){
            System.out.println("Cidade Inválida!");
        }
    }
}
