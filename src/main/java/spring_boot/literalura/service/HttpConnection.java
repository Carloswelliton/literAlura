package spring_boot.literalura.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class HttpConnection {

  public String connection(String address){
    HttpClient client  = HttpClient.newHttpClient();
    HttpRequest request = HttpRequest.newBuilder()
      .uri(URI.create(address))
      .timeout(Duration.ofSeconds(30))
      .header("Accept","application/json")
      .GET()
      .build();

    HttpResponse<String> response = null;

    try {
      response = client
        .send(request, HttpResponse.BodyHandlers.ofString());
      
      if(response.statusCode()!=200){
        throw new RuntimeException("erro na busca da API "+ response.statusCode() + "\nresposta: " + response.body());
      }

      return response.body();
    
    } catch (Exception e) {
      throw new RuntimeException("Falha ao conectar com: " + address, e);
    }
    
  }
  
}
