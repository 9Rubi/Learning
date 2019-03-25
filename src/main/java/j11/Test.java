package j11;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.zip.GZIPInputStream;

/**
 * @author : Rubi
 * @version : 2019-03-13 17:36 下午
 */
public class Test {
    public static void main(String[] args) throws Exception {
        var url = "http://wthrcdn.etouch.cn:80//weather_mini?city=湖州";
        CompletableFuture<HttpResponse<String>>  future = HttpClient.newHttpClient().sendAsync(
                HttpRequest.newBuilder(URI.create(url))
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET().build(), HttpResponse.BodyHandlers.ofString());

//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        GZIPInputStream inputStream = new GZIPInputStream(new BufferedInputStream(new ByteArrayInputStream(future.get().body())));
//        byte[] buffer = new byte[256];
//        int n;
//        while ((n = inputStream.read(buffer)) >= 0) {
//            out.write(buffer, 0, n);
//        }
//        out.write();
//        HttpResponse<String> response =
        future.get().headers().map().forEach((key, values) -> System.out.println(key+":"+values));

//        new Thread(()-> {
//            try {
//                System.out.println(future.get().body());
//            } catch (InterruptedException |ExecutionException e) {
//                e.printStackTrace();
//            }
//        }).start();
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
        Test test = new Test();
    }
}
