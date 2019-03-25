package j11.leetcode;

/**
 * @author : Rubi
 * @version : 2019-03-24 17:11 下午
 */
public class 数字的补数 {
    /**
     * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
     * <p>
     * 注意:
     * <p>
     * 给定的整数保证在32位带符号整数的范围内。
     * 你可以假定二进制数不包含前导零位。
     * <p>
     * 示例 1:
     * <p>
     * 输入: 5
     * 输出: 2
     * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
     * <p>
     * 示例 2:
     * <p>
     * 输入: 1
     * 输出: 0
     * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(find2(5));
        System.out.println(~5);
    }
    private static int find2(int num){
        return ~num & Integer.highestOneBit(num) - 1;
    }
    public static int findComplement(int num) {
        int n = 0;
        while (true) {
            int value = Integer.MAX_VALUE >> n;
            if (value < num) {
                return ((value<<1)+1) ^ num;
            }
            n++;
        }

    }
}
