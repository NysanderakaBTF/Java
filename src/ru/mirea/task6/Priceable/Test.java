package ru.mirea.task6.Priceable;

public class Test {
    public static void main(String[] args){
        Phone p=new Phone(780);
        Ring r =new Ring();
        System.out.println(p.getPrice());
        System.out.println(r.getPrice());
    }
}
