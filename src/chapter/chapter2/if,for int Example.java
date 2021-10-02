package chapter.chapter2;

import apple.laf.JRSUIConstants;

public class IfExample {
    public static void main(String[] args) {
        int a = 2;
        System.out.println("a=" + a);
        a = a * 5;
        System.out.println("a=" + a);
        if (a == 20) {
            System.out.println(" ճիշտ է");
        } else
            System.out.println("debilik");
        {
            for (int i = 0; i < 20; i++)
                System.out.println(i + "hello");
        }
        int x, y;
        x = 10;
        y = 20;
        if (x < y) {
            System.out.println("x менше y ");
            x = 2 * x;
            if (x == y) System.out.println("x теперь  равно y");
            x = x * 2;
            if (x > y)
                System.out.println("x теперь больше y");
        }


    }
}
