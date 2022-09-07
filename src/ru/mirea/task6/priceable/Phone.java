package ru.mirea.task6.priceable;

public class Phone implements Priceable{
    private int price;
    public Phone(int price){
        this.price=price;
    }
    public Phone(){
        price = 630;
    }
    @Override
    public int getPrice(){
        return price;
    }
}
