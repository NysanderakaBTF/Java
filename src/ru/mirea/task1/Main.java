package ru.mirea.task1;

import org.jetbrains.annotations.NotNull;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static void task1(){
        System.out.println("Arr summ");
        int[] arr={4,5,6,74,38,936,8,1,2};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("For "+sum);
        sum=0;
        int q=0;
        while (q<arr.length){
            sum+=arr[q];
            q++;
        }
        System.out.println("While "+sum);
        sum=0;
        q=0;
        do {
            sum+=arr[q];
            q++;
        } while (q<arr.length);
        System.out.println("do while "+sum);
    }
    static void t3(){
        DecimalFormat dF = new DecimalFormat("#.####");
        for(int i=1;i<=10;i++){
            System.out.print(dF.format(1.0/(double)i) + " ");
        }
        System.out.println();
    }
    static int factorial(int n){
        if (n<=1)
            return 1;
        else return n*factorial(n-1);
    }
    static void t4(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter aray size");
        int si=in.nextInt();
        int[] arr = new int[si];

        for(int i=0;i<si;i++){
            arr[i]=(int)(Math.random()*1000);
        }
        for(int i=0;i<si;i++){
           System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<si;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Random aa = new Random();
        for(int i=0;i<si;i++){
            arr[i]= aa.nextInt();
        }
        for(int i=0;i<si;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        for(int i=0;i<si;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public static void main(String @NotNull [] args){
        task1();
        Scanner in = new Scanner(System.in);
        System.out.println("Args display");
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
        t3();
        t4();
        System.out.println("Введите число для факториала");
        int n = in.nextInt();
        System.out.println(n+"!= "+factorial(n));
    }
}