package j11.leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author : Rubi
 * @version : 2019-03-22 17:10 下午
 */
public class 唯一摩尔斯密码词 {
    /**
     * 国际摩尔斯密码定义一种标准编码方式，将每个字母对应于一个由一系列点和短线组成的字符串， 比如: "a" 对应 ".-", "b" 对应 "-...", "c" 对应 "-.-.", 等等。
     * 为了方便，所有26个英文字母对应摩尔斯密码表如下：
     * ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."
     * 给定一个单词列表，每个单词可以写成每个字母对应摩尔斯密码的组合。例如，"cab" 可以写成 "-.-..--..."，(即 "-.-." + "-..." + ".-"字符串的结合)。我们将这样一个连接过程称作单词翻译。
     * 返回我们可以获得所有词不同单词翻译的数量。
     * <p>
     * 例如:
     * 输入: words = ["gin", "zen", "gig", "msg"]
     * 输出: 2
     * 解释:
     * 各单词翻译如下:
     * "gin" -> "--...-."
     * "zen" -> "--...-."
     * "gig" -> "--...--."
     * "msg" -> "--...--."
     * <p>
     * 共有 2 种不同翻译, "--...-." 和 "--...--.".
     * 注意:
     * <p>
     * 单词列表words 的长度不会超过 100。
     * 每个单词 words[i]的长度范围为 [1, 12]。
     * 每个单词 words[i]只包含小写字母。
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println(uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"}));
    }


    public static int uniqueMorseRepresentations(String[] words) {
        Map<Character, String> map = new HashMap<>() {
            {
                put('a', ".-");
                put('b', "-...");
                put('c', "-.-.");
                put('d', "-..");
                put('e', ".");
                put('f', "..-.");
                put('g', "--.");
                put('h', "....");
                put('i', "..");
                put('j', ".---");
                put('k', "-.-");
                put('l', ".-..");
                put('m', "--");
                put('n', "-.");
                put('o', "---");
                put('p', ".--.");
                put('q', "--.-");
                put('r', ".-.");
                put('s', "...");
                put('t', "-");
                put('u', "..-");
                put('v', "...-");
                put('w', ".--");
                put('x', "-..-");
                put('y', "-.--");
                put('z', "--..");
            }
        };
        Set<String> set = new HashSet<>();
        int length1 = words.length;
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < length1; i++) {
            char[] chars = words[i].toCharArray();
            for (int j = 0; j < chars.length; j++) {
                sb.append(map.get(chars[j]));
            }
            set.add(sb.toString());
            sb.setLength(0);
        }

//        StringBuilder stringBuilder = new StringBuilder();
//        for (String word : words) {
//            char[] chars = word.toCharArray();
//            for (char c : chars) {
//                stringBuilder.append(map.get(c));
//            }
//            set.add(stringBuilder.toString());
//            stringBuilder.setLength(0);
//        }
        return set.size();
    }


    /*
    public static int uniqueMorseRepresentations(String[] words) {
        String[] map = {
          ".-",
          "-...",
          "-.-.",
          "-..",
          ".",
          "..-.",
          "--.",
          "....",
          "..",
          ".---",
          "-.-",
          ".-..",
          "--",
          "-.",
          "---",
          ".--.",
          "--.-",
          ".-.",
          "...",
          "-",
          "..-",
          "...-",
          ".--",
          "-..-",
          "-.--",
          "--.."
        };
        HashSet<String> set = new HashSet<>();
        for(String s:words){
            StringBuilder sb = new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(map[c - 'a']);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
    */
}
