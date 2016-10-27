package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 更改前：a×b
 * 更改后：
 */
public class Ex_1_1_18 {
    public static void main(String[] args) {
        StdOut.println(mystery(2,25));
        StdOut.println(mystery(3,11));

        StdOut.println(mystery2(2,25));
        StdOut.println(mystery2(3,11));
    }

    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }
    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a * a, b / 2);
        return mystery(a * a, b / 2) * a;
    }
}
