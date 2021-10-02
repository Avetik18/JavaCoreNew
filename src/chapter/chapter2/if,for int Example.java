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


        }


    }
}
