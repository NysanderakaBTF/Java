package ru.mirea.task5.Furniture;

public class Wardrobe extends Furniture {
    private int doorNumber;
    public Wardrobe(String color, String material, int doorNumber){
        super(color, material);
        this.doorNumber=doorNumber;
        cost=1750;
    }
    public Wardrobe(String color, String material, int doorNumber, float cost){
        super(color, material,cost);
        this.doorNumber=doorNumber;
    }

    @Override
    public String toString() {
        return "The wardrobe is "+color+", made of"+material+" has "+doorNumber+" doors";
    }
}
