package j11.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author : Rubi
 * @version : 2019-03-26 23:24 下午
 */
public class 键盘行 {

    /**
     * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
     *
     * <p>
     *
     * <img src="https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/keyboard.png" />
     * <p>
     * <p>
     * <p>
     * 示例：
     * <p>
     * 输入: ["Hello", "Alaska", "Dad", "Peace"]
     * 输出: ["Alaska", "Dad"]
     * <p>
     * <p>
     * <p>
     * 注意：
     * <p>
     * 你可以重复使用键盘上同一字符。
     * 你可以假设输入的字符串将只包含字母。
     * <p>
     * 在真实的面试中遇到过这道题？
     *
     * @param args
     */
    public static void main(String[] args) {
        String[] words = findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        Stream.of(words).forEach(System.out::println);
    }

    public static String[] findWords(String[] words) {
//        int[] lineNumber = new int[]{2,3,3,2,1,2,2,2,1,2,2,2,3,3,1,1,1,1,2,1,1,3,1,3,1,3};
        Map<Character, Integer> map = new HashMap<>() {{
            put('a', 2);
            put('b', 3);
            put('c', 3);
            put('d', 2);
            put('e', 1);
            put('f', 2);
            put('g', 2);
            put('h', 2);
            put('i', 1);
            put('j', 2);
            put('k', 2);
            put('l', 2);
            put('m', 3);
            put('n', 3);
            put('o', 1);
            put('p', 1);
            put('q', 1);
            put('r', 1);
            put('s', 2);
            put('t', 1);
            put('u', 1);
            put('v', 3);
            put('w', 1);
            put('x', 3);
            put('y', 1);
            put('z', 3);
        }};
        List<String> result = new ArrayList<>();
        for (String word : words) {
            boolean ok = true;
            boolean first = true;
            int line = 0;
            char[] chars = word.toLowerCase().toCharArray();
            for (char c : chars) {
                if (first) {
                    line = map.get(c);
                    first = false;
                }
                if (map.get(c) != line) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}
