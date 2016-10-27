package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 打印出一个M行N列的二维数组的转置（交换行和列）
 */
public class Ex_1_1_13 {
    public static void main (String[] args){
        int[][] a = new int[][]{{1, 2, 3, 4}
                , {5, 6, 7, 8}
                , {9, 10, 11, 12}};
        int[][] b = doExchange(a);
        for (int i=0;i<b.length;i++) {
            for (int j=0;j<b[i].length;j++) {
                StdOut.printf("%3d",b[i][j]);
            }
            StdOut.println();
        }
    }

    /**
     * 矩阵转置
     * @param a 待转换矩阵
     * @return 准换后的矩阵
     */
    private static int[][] doExchange(int[][] a) {
        int M = a.length;
        int N = a[0].length;
        int[][] b = new int[N][M];
        for (int i=0;i<a.length;i++) {
            for (int j=0;j<a[i].length;j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}
