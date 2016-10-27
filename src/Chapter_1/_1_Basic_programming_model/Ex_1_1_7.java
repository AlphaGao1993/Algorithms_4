package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-17.
 * 下面几段代码分别输出什么？
 */
public class Ex_1_1_7 {
    public static void main(String[] args) {
        a();
        b();
        c();
    }

    private static void c() {
        int sum = 0;
        for (int i=0;i<1000;i++) {
            for (int j=0;j<1000;j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    private static void b() {
        int sum = 0;
        for (int i=1;i<1000;i++) {
            for (int j=0;j<i;j++) {
                sum++;
            }
        }
        StdOut.println(sum);
    }

    private static void a() {
        double t = 9.0;
        while (Math.abs(t - 9.0 / t) > .001) {
            t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
    }
}
