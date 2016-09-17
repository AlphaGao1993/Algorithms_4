package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

import java.util.Scanner;

/**
 * Created by alpha on 16-9-17.
 * 编写一个程序，从命令行得到三个整数参数。如果它们都相等则打印equal，否则打印not equal
 */
public class Ex_1_1_3 {
    public static void main (String[] args){
        Scanner in =new Scanner(System.in);
        int a =in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        if (a==b&&b==c) {
            StdOut.print("equal");
        }else {
            StdOut.print("not equal");
        }
        in.close();
    }
}
