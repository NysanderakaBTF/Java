package ru.mirea.task5.dog;

import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {
        String name, mood;
        int age;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name, age and mood of the dog");
        name=in.next();
        age=in.nextInt();
        mood=in.next();
        Huskey h = new Huskey(name,age,mood);
        System.out.println(h.toString());
        System.out.println("And now roll!");
        h.roll();

        System.out.println("Enter name, age of the dog");
        name=in.next();
        age=in.nextInt();
        Huskey h2 = new Huskey(name,age);
        System.out.println(h2.toString());

        System.out.println("Enter name, age of the dod");
        name=in.next();
        age=in.nextInt();
        Malamut h1 = new Malamut(name,age);
        System.out.println(h1.toString());


    }
}
