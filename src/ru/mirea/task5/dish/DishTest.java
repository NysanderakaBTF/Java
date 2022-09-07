package ru.mirea.task5.dish;

import java.util.Scanner;

public class DishTest {
    public static void main(String[] args){
        String size, material, extr;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size, material and purpose of the cup");
        size=in.next();
        material=in.next();
        extr=in.next();
        Cup cup= new Cup(size,material,extr);
        System.out.println(cup);

        System.out.println("Enter size, material of the cup");
        size=in.next();
        material=in.next();
        Cup cup1= new Cup(size,material);
        System.out.println(cup1);

        System.out.println("Enter size, material of the bowl");
        size=in.next();
        material=in.next();
        Bowl b= new Bowl(size,material);
        System.out.println(b);

        System.out.println("Enter size, material, depth of the bowl");
        size=in.next();
        material=in.next();
        extr=in.next();
        Bowl b1= new Bowl(size,material,extr);
        System.out.println(b1);
    }
}
