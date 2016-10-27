package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

import java.util.Scanner;

/**
 * Created by alpha on 16-9-18.
 * 编写一个静态方法lg()，接收一个整形参数，返回不大于log2 N的最大整数，不要使用Math库
 */
public class Ex_1_1_14 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StdOut.print(lg(N));
    }

    private static int lg(int n) {
        if (n <= 0) {
            throw new RuntimeException("n should be bigger than 0");
        }
        int x = -1;
        int sum = 1;
        while (sum <= n) {
            sum *= 2;
            x++;
        }
        return x;
    }
}
