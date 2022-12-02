package ru.mirea.task12;

import java.util.Random;
import java.util.Scanner;
public class Sorts {
    public static void InsSort(Object[] arr){
        for (int i = 1; i < arr.length; i++) {
            int q=i-1;
            Student qq = (Student) arr[i];
            while (q>=0 && ((Student) arr[q]).getId()>qq.getId()){
                arr[q+1]=arr[q];
                q--;
            }
            arr[q+1]=qq;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Object[] a = new Object[q];
        Random random = new Random();
        for (int i = 0; i < q; i++) {
            if(i%2==0)
                a[i]= new Student(String.valueOf(random.nextInt()), random.nextInt(),random.nextInt(100)%70 );
            else
                a[i]=new BetterStudent(String.valueOf(random.nextInt()), random.nextInt(),random.nextInt(100)%100,"Some awards" );
        }
        for (int i = 0; i < q; i++) {
            System.out.println(a[i]);
        }
        InsSort(a);
        System.out.println("////////////////////////////////////////");
        for (int i = 0; i < q; i++) {
            BetterStudent b ;
            Student s = (Student) a[i];
            try {
                b = (BetterStudent) a[i];
                System.out.println(b);
            }catch (Exception e){
                System.out.println(s);
            }


        }
    }
}
