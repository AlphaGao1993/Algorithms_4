package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

import java.util.Scanner;

/**
 * Created by alpha on 16-9-19.
 * 编写一个递归的静态方法计算ln(N!)的值
 */
public class Ex_1_1_20 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        StdOut.println(Math.log(factorial(x)));
        StdOut.println(factorialln(x));
    }

    /**
     * 未对log进行拆解的计算方法
     * @param x 阶乘
     * @return x!的值
     */
    private static double factorial(int x) {
        if (x == 0 || x == 1) return 1;
        else return x * factorial(x - 1);
    }

    /**
     * 对log进行了拆解的计算方法(log(A*B)=log(A)+log(B))
     * @param x 阶乘
     * @return ln(x!)的值
     */
    private static double factorialln(int x) {
        if (x > 1) return Math.log(x) + factorialln(x - 1);
        else return 0;
    }

}
