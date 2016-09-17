package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-17.
 * 下面这段程序会打印出什么
 */
public class Ex_1_1_6 {
    public static void main (String[] args){
        int f = 0;
        int g = 1;
        for (int i=0;i<=15;i++) {
            StdOut.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
