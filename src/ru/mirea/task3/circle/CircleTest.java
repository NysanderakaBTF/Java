package ru.mirea.task3.circle;

import java.util.Scanner;

public class CircleTest {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double x,y,r;
        System.out.println("Enter radius, x, y coords");
        r=in.nextDouble();
        x=in.nextDouble();
        y=in.nextDouble();
        Circle a = new Circle(r,x,y);
        System.out.println(a);
        System.out.println("Default circle:\n "+new Circle());
    }
}
