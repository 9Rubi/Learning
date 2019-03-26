package j11.leetcode;

/**
 * @author : Rubi
 * @version : 2019-03-26 22:51 下午
 */
public class 斐波那契数 {

    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    public static int fib(int N) {
        if (N < 2) return N;
        int f[] = new int[N+1];
        f[0]=0;
        f[1]=1;
        for (int i = 2; i <= N; i++) {
            f[i]=f[i-1]+f[i-2];
        }
        return f[N];
    }

}
