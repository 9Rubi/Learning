package j11.leetcode;

/**
 * @author : Rubi
 * @version : 2019-03-26 23:08 下午
 */
public class 反转字符串 {
    /**
     * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
     * <p>
     * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
     * <p>
     * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：["h","e","l","l","o"]
     * 输出：["o","l","l","e","h"]
     * <p>
     * 示例 2：
     * <p>
     * 输入：["H","a","n","n","a","h"]
     * 输出：["h","a","n","n","a","H"]
     *
     * @param args
     */
    public static void main(String[] args) {
        char[] a = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] ab = new char[]{'h', 'e', 'l', 'a', 'o', 'e'};
        reverseString(ab);
        for (char c : ab) {
            System.out.println(c);
        }
    }

    public static void reverseString(char[] s) {
        int n=s.length;
        for (int i = 0; i < n / 2; i++) {
            if (s[i] != s[n - 1 - i]) {
                char tmp= s[i];
                s[i] = s[n - 1 - i];
                s[n - 1 - i] = tmp;
            }
        }
    }
}
