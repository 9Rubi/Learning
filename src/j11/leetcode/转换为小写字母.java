package j11.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Rubi
 * @version : 2019-03-21 15:11 下午
 */
public class 转换为小写字母 {
    /**
     * 709. 转换成小写字母
     * 题目描述
     * 评论 (140)
     * 题解
     * 提交记录
     * <p>
     * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入: "Hello"
     * 输出: "hello"
     * <p>
     * 示例 2：
     * <p>
     * 输入: "here"
     * 输出: "here"
     * <p>
     * 示例 3：
     * <p>
     * 输入: "LOVELY"
     * 输出: "lovely"
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(toLowerCase2("azAADDSMCNMZSAZ"));
    }

    /**
     * 65~90大写  97~122小写
     *
     * @param str
     * @return
     */
    public static String toLowerCase1(String str) {
        StringBuilder builder = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char curr = str.charAt(i);
            if (curr <= 90 && curr >= 65) {
                builder.append((char) (curr + 32));
            } else {
                builder.append(curr);
            }
        }
        return builder.toString();
    }


    public static String toLowerCase2(String str) {
        Map<Character, Character> map = new HashMap<>() {
            {
                put('A', 'a');
                put('B', 'b');
                put('C', 'c');
                put('D', 'd');
                put('E', 'e');
                put('F', 'f');
                put('G', 'g');
                put('H', 'h');
                put('I', 'i');
                put('J', 'j');
                put('K', 'k');
                put('L', 'l');
                put('M', 'm');
                put('N', 'n');
                put('O', 'o');
                put('P', 'p');
                put('Q', 'q');
                put('R', 'r');
                put('S', 's');
                put('T', 't');
                put('U', 'u');
                put('V', 'v');
                put('W', 'w');
                put('X', 'x');
                put('Y', 'y');
                put('Z', 'z');
            }

        };
        int length = str.length();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            char curr = str.charAt(i);
            if (map.containsKey(curr)) {
                builder.append(map.get(curr));
            } else {
                builder.append(curr);
            }
        }
        return builder.toString();
    }
}
