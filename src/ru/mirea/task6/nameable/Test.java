package ru.mirea.task6.nameable;

public class Test {
    public static void main(String[] args){
        Planet p = new Planet("Neptune");
        Car c = new Car("Bently 1960");
        Cat k = new Cat("Mike");
        System.out.println(p.getName());
        System.out.println(c.getName());
        System.out.println(k.getName());
    }
}
