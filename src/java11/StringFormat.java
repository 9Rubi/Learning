package java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : Rubi
 * @version : 2019-01-22 22:28 下午
 */
public class StringFormat {
    public static void main(String[] args) throws Exception{

        var uri = "https://www.random.org/integers/?col=1&min=1&max=10&num=10&format=plain&rnd=new&base=10";

        var client = HttpClient.newHttpClient();
        var request = HttpRequest.newBuilder()
                .uri(URI.create(uri))
                .method("GET", HttpRequest.BodyPublishers.noBody())
                .build();
//        String result="";
//        final String result;
        //  var response = client.send(request, HttpResponse.BodyHandlers.ofString());

       var source= client.send(request, HttpResponse.BodyHandlers.ofString()).body();


        final Set<Integer> sets = new HashSet<>();

        source.lines().forEach(s -> {
            System.out.println(s);
            sets.add(Integer.valueOf(s));
        });
        System.out.println(sets.size());
    }

}
