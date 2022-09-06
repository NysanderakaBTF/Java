package ru.mirea.task6.Priceable;

public class Ring implements Priceable{
    private int price;
    public Ring(int price){
        this.price=price;
    }
    public Ring(){
        price = 1980;
    }
    @Override
    public int getPrice(){
        return price;
    }
}
