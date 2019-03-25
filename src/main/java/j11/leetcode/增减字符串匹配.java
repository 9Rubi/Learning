package j11.leetcode;

import java.util.stream.IntStream;

/**
 * @author : Rubi
 * @version : 2019-03-22 15:22 下午
 */
public class 增减字符串匹配 {
    /**
     * 题目描述
     * 评论 (90)
     * 题解
     * 提交记录
     * <p>
     * 给定只含 "I"（增大）或 "D"（减小）的字符串 S ，令 N = S.length。
     * <p>
     * 返回 [0, 1, ..., N] 的任意排列 A 使得对于所有 i = 0, ..., N-1，都有：
     * <p>
     * 如果 S[i] == "I"，那么 A[i] < A[i+1]
     * 如果 S[i] == "D"，那么 A[i] > A[i+1]
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输出："IDID"
     * 输出：[0,4,1,3,2]
     * <p>
     * 示例 2：
     * <p>
     * 输出："III"
     * 输出：[0,1,2,3]
     * <p>
     * 示例 3：
     * <p>
     * 输出："DDI"
     * 输出：[3,2,0,1]
     * <p>
     * <p>
     * <p>
     * 提示：
     * <p>
     * 1 <= S.length <= 1000
     * S 只包含字符 "I" 或 "D"。
     *
     * @param args
     */
    public static void main(String[] args) {
        IntStream.of(diStringMatch("III")).forEach(System.out::println);
    }

    public static int[] diStringMatch(String S) {
        int count1=0,count2=0,N = S.length();
        int[] tmp = new int[N+1];
        for (int i = 0; i < N; i++) {
            if ('I'==(S.charAt(i))){
                tmp[i]=count1;
                count1++;
            }else {
                tmp[i]=N-count2;
                count2++;
            }

        }
        tmp[N]=count1;
        return tmp;
    }
}
