package j11.detail;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author : Rubi
 * @version : 2019-03-28 18:14 下午
 */
public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.stream().flatMap(Stream::of).forEach(System.out::println);
    }
}
