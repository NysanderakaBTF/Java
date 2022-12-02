package ru.mirea.task12;

import java.util.Random;
import java.util.Scanner;

public class Sorts {
    public static void InsSort(Student[] arr){
        for (int i = 1; i < arr.length; i++) {
            int q=i-1;
            Student qq = arr[i];
            while (q>=0 && arr[q].getId()>qq.getId()){
                arr[q+1]=arr[q];
                q--;
            }
            arr[q+1]=qq;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        Student[] a = new Student[q];
        Random random = new Random();
        for (int i = 0; i < q; i++) {
            a[i]=new Student(String.valueOf(random.nextInt()), random.nextInt(),random.nextInt(100) );
        }
        for (int i = 0; i < q; i++) {
            System.out.println(a[i]);
        }
        InsSort(a);
        System.out.println("////////////////////////////////////////");
        for (int i = 0; i < q; i++) {
            System.out.println(a[i]);
        }
    }
}
