package Chapter_1._1_Basic_programming_model;

import StdLib.StdIn;
import StdLib.StdOut;

/**
 * Created by alpha on 16-9-20.
 * 编写一段程序，从标准输入按行读取数据，其中每行都包含一个名字和两个整数。
 * 然后用printf() 打印一张表格，每行的若干列数据包括名字、两个整数和第一
 * 个整数除以第二个整数的结果，精确到小数点后三位。可以用这种程序将棒球球手
 * 的击球命中率或者学生的考试分数制成表格
 */
public class Ex_1_1_21 {
    public static void main (String[] args){
        //将每一行读取为一个字符串，再分割为每个字符串
        String[] list = StdIn.readAllLines();
        for (int i=0;i<list.length;i++) {
            String[] m = list[i].split(" ");
            float value1 = Float.parseFloat(m[1]);
            float value2 = Float.parseFloat(m[2]);
            float result = value1 / value2;
            StdOut.printf("%10s | %.1f | %.1f | %.3f\n", m[0],value1, value2, result);
        }
    }
}
