package Chapter_1._1_Basic_programming_model;

import StdLib.StdOut;

/**
 * Created by alpha on 16-9-18.
 * 打印出一个二维布尔数组的内容。其中，使用×表示真，空格表示假。打印出行号和列号
 */
public class Ex_1_1_11 {
    public static void main (String[] args) {
        boolean[][] list = new boolean[][]{{true, false, false, true}
                , {false, false, true, false, true}
                , {false, true, true}};
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j]) {
                    StdOut.println("list["+i+"]["+j+"]*");
                } else {
                    StdOut.println("list["+i+"]["+j+"] ");
                }
            }
        }
    }
}
