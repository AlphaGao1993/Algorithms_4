package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

import java.util.Scanner;

/**
 * Created by alpha on 16-9-18.
 * 编写一段代码，将一个正整数N用二进制表示病转换为一个String类型的值s
 */
public class Ex_1_1_9 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        StdOut.println(to10(N));
    }

    private static String to10(int n) {
        String s = "";
        while (n > 0) {
            s = n % 2 + s;
            n /= 2;
        }
        return s;
    }
}
