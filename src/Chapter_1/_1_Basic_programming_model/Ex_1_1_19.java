package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-19.
 * 该进原有的斐波那契数列的效率，使用数组存储已经计算过的值
 */
public class Ex_1_1_19 {
    public static void main(String[] args) {
        for (int N = 0; N < 100; N++)
            StdOut.println(F2(N));
        //StdOut.println(N + " " + F(N));
    }

    private static long F(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n - 1) + F(n - 2);
    }

    /**
     * 改进的斐波那契数列
     * @param n 行数
     * @return 当前行的数值
     */
    private static long F2(int n) {
        long[] x = new long[]{0, 1};
        if (n == 0) return x[0];
        if (n == 1) return x[1];
        for (int i = 2; i <= n; i++) {
            x[1] = x[0] + x[1];
            x[0] = x[1] - x[0];
        }
        return x[1];
    }
}
