package demo;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientDemo {

    static void main() throws Exception {
//        var client = HttpClient.newHttpClient();
        var client = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_3)
                .build();
        var request = HttpRequest.newBuilder(URI.create("https://www.jtechlog.hu/"))
                .GET().build();
        var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.statusCode());
        var htmlText = response.body();
        System.out.println(htmlText);
    }
}
