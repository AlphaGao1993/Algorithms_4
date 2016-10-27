package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 编写一个静态方法histogram()，接收一个整型数组和一个整数M为参数病返回一个大小为M的的数组，
 * 其中第i个元素的值为整数i在参数数组中出现的次数。如果a[]中的值均在0到M-1之间，返回数组中所
 * 有元素之和应该和a.length()相等。
 */
public class Ex_1_1_15 {
    public static void main (String[] args){
        int[] a = new int[]{0, 1, 4, 2, 7, 4, 2, 9, 0, 6, 5, 3};
        int M=10;
        int[] b = histogram(a, M);
        int sum=0;
        for (int i=0;i<b.length;i++) {
            StdOut.printf("%-3d", b[i]);
            sum += b[i];
        }
        StdOut.println("\nsum=" + sum);
    }

    private static int[] histogram(int[] a, int m) {
        int[] b = new int[m];
        for (int i=0;i<a.length;i++) {
            b[a[i]]++;
        }
        return b;
    }
}
