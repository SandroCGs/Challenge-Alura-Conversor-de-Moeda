package http;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ResponseHttp {

    private HttpClient client;
    private HttpRequest request;

    public String Response(HttpClient client, HttpRequest request){
        try {
            HttpResponse<String> response = client
                    .send(request, java.net.http.HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e){
            return e.getMessage();
        }
    }
}
