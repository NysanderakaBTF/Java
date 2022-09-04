package ru.mirea.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class TestDog {
    ArrayList<Dog> dogs = new ArrayList<Dog>(0);
    public void addDogs(){
        String name;
        int age;
        System.out.println("Enter num of dogs");
        int kol;
        Scanner in = new Scanner(System.in);
        kol = in.nextInt();
        System.out.println("Enter name and age of each dog");
        for(int i=0;i<kol;i++){
            name = in.next();
            age = in.nextInt();
            dogs.add(new Dog(name,age));
        }
    }

    public void showDogs(){
        for (Dog a:dogs) {
            System.out.println(a.toString());
        }

    }
}
