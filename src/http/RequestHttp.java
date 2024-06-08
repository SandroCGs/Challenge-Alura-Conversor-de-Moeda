package http;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class RequestHttp {

    private String endereco = "";
    private HttpClient client;
    private HttpRequest request;
    private String json;
    private Double conversionRate;

    ResponseHttp responseHttp = new ResponseHttp();
    JsonConverter jsonConverter = new JsonConverter();

    public void GeraLink(String base, String alvo){
        this.endereco = "https://v6.exchangerate-api.com/v6/fd54d29a91512d0e880b7bf6/pair/" + base + "/" + alvo;
    }

    public void ClientRequest(){
        client = HttpClient.newHttpClient();
        request = HttpRequest.newBuilder()
                .uri(URI.create(getEndereco()))
                .build();
        json = responseHttp.Response(client, request);
        conversionRate = jsonConverter.Conversor(json);
    }

    public String getEndereco() {
        return endereco;
    }

    public Double getConversionRate() {
        return conversionRate;
    }
}
