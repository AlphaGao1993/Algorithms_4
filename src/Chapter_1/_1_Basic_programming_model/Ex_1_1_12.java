package Chapter_1._1_Basic_programming_model;

/**
 * Created by alpha on 16-9-18.
 * 以下代码会打印出什么
 */
public class Ex_1_1_12 {
    public static void main (String[] args){
        int[] a = new int[10];
        for (int i=0;i<10;i++)
            a[i]=9-i;
        for (int i=0;i<10;i++)
            a[i]=a[a[i]];
        for (int i=0;i<10;i++)
            System.out.println(i);//这里打印的只是循环的序号，与数组的内容无关
    }
}
