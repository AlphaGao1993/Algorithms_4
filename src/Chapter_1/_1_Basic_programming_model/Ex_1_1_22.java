package Chapter_1._1_Basic_programming_model;

import StdLib.StdIn;
import StdLib.StdOut;

/**
 * Created by alpha on 16-9-22.
 * 使用rank()递归方法重新实现BinarySearch并跟踪该方法的调用。每当该方法被调用时，
 * 打印出它的参数lo和hi并按照递归的深度缩进。提示：为递归方法添加一个参数保存递归的深度
 */
public class Ex_1_1_22 {
    public static void main(String[] args) {
        int key = StdIn.readInt();
        int[] t = StdIn.readAllInts();
        rank(key, t);
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    private static int rank(int key, int[] a, int lo, int hi, int deep) {
        StdOut.println("lo:" + lo + ",hi:" + hi + ",deep:" + deep);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        StdOut.println("mid:"+mid+",a[mid]:"+a[mid]);
        if (key < a[mid]) return rank(key, a, lo, mid - 1, ++deep);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++deep);
        else return mid;
    }
}
