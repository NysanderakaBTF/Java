package ru.mirea.task2;

import ru.mirea.task2.Shape;

import java.util.Scanner;

public class ShapeTester {
    public void test() {
        Scanner in = new Scanner(System.in);
        String m,t,c;
        System.out.println("Enter type, color and material");
        t=in.next();
        c=in.next();
        m=in.next();
        Shape sh1 = new Shape(t);
        Shape sh2 = new Shape(t,c);
        Shape sh3 = new Shape(t,c,m);
        Shape sh4 = new Shape();
        System.out.println(sh1+"\n"+sh2+"\n"+sh3+"\n"+sh4);
    }
}
