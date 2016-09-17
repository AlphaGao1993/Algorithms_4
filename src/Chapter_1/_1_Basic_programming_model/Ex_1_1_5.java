package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

import java.util.Scanner;

/**
 * Created by alpha on 16-9-17.
 * 编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true，否则打印false
 */
public class Ex_1_1_5 {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        double x=in.nextDouble();
        double y=in.nextDouble();
        if (0<=x&&x<=1&&0<=y&&y<=1) {
            StdOut.print("true");
        }else {
            StdOut.print("false");
        }
    }
}
