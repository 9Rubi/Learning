package java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 * @author : Rubi
 * @version : 2019-01-21 15:50 下午
 */
public class TestVar {

    public static void main(String[] args)throws Exception {
        var uri = "http://pv.sohu.com//cityjson?ie=utf-8";

        var  client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .method("POST",HttpRequest.BodyPublishers.noBody())
                .build();
//        String result="";
//        final String result;
      //  var response = client.send(request, HttpResponse.BodyHandlers.ofString());

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(s -> {var result=s;
                    System.out.println(result);});
        System.out.println("测试异步");
        Thread.sleep(5000);
        System.out.println("测试异步");
    }
}
