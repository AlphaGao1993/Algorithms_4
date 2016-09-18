package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 给出exR1(6)的返回值
 */
public class Ex_1_1_16 {
    public static void main(String[] args) {
        StdOut.print(exR1(6));
    }

    private static String exR1(int n) {
        if (n <= 0) {
            return "";
        }
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }
}
