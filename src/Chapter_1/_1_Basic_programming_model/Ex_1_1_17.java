package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 找出以下递归函数的问题
 *
 * 递归函数第一句应该是带有return的判断语句
 */
public class Ex_1_1_17 {
    public static void main(String[] args) {
        StdOut.print(exR2(6));
    }

    private static String exR2(int n) {
        /*String s = exR2(n - 3) + n + exR2(n - 2) + n;
        if (n <= 0) {
            return "";
        }
        return s;*/
        if (n <= 0) {
            return "";
        }
        return exR2(n - 3) + n + exR2(n - 2) + n;
    }
}
