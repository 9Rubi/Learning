package j11.leetcode;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author : Rubi
 * @version : 2019-03-21 01:48 上午
 */
public class 宝石与石头 {


    /**
     * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。 S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
     * <p>
     * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
     * <p>
     * 示例 1:
     * <p>
     * 输入: J = "aA", S = "aAAbbbb"
     * 输出: 3
     * <p>
     * 示例 2:
     * <p>
     * 输入: J = "z", S = "ZZ"
     * 输出: 0
     * <p>
     * 注意:
     * <p>
     * S 和 J 最多含有50个字母。
     * J 中的字符不重复。
     *
     * @param args
     */
    public static void main(String[] args) {


        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }


    public static int numJewelsInStones(String J, String S) {
        int i=0,length=S.length();
        for (int j=0;j<length;j++)
            if (J.indexOf(S.charAt(j))>-1)
                i++;
        return i;
    }

}
