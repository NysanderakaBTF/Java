package ru.mirea.task10;

import java.util.Objects;
import java.util.Scanner;

public class Tasks {
    //tasks2-6
    public static void t2(int n){
        if (n >=1) {
            t2(n-1);
        } else {
            return;
        }
        System.out.println(n);

    }
    public static void t3(int a, int b){
        if(a>b){
            System.out.println(a);
            a--;
            t3(a, b);
        }else if(a<b) {
            System.out.println(a);
            a++;
            t3(a, b);
        } else if (a==b) {
            System.out.println(b);
            return;
        }
    }
    public static void t4(int sum, int len, int k, int d, int n){
        if(len==k && sum == d){
            System.out.println(n);
            return;
        }
        if((String.valueOf(n)).length()>k){
            return;
        }
        int i=0;
        if(len==0) i=1;
        int f=n;
        while (i<10){
            f=n*10+i;
            t4(sum+i, len+1, k,d,f);
            i++;
        }
    }
    public static int t5(int n){
        if(n==0) return 0;
        return n%10+t5(n/10);
    }
    public static boolean t6(int n, int del){
        if(n==2) return true;
        if (n%del==0 || n<2) return false;
        if(del*del<n){
            return t6(n, del+1);
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k=in.nextInt(),d;
        t2(k);
        k=in.nextInt();
        d=in.nextInt();
        t3(k,d);
        k=in.nextInt();
        d=in.nextInt();
        t4(0,0,k,d,0);
        k=in.nextInt();
        System.out.println(t5(k));
        k=in.nextInt();
        if(t6(k,2))
            System.out.println("YER");
        else System.out.println("NO");

    }
}
