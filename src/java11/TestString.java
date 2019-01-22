package java11;

/**
 * @author : Rubi
 * @version : 2019-01-21 16:04 下午
 */
public class TestString {
    public static void main(String[] args) {
        var a = ":axzc\nszxc\ndzxc\nazxc\nszxc\ndzxc\nazxc\nszxc\ndzxc";

        System.out.println(a.isBlank());
//        System.out.println(a.repeat(50));
                System.out.println(a.lines().peek(s -> s.startsWith("a")));

                }
                }
