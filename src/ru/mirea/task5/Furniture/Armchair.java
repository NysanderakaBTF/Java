package ru.mirea.task5.Furniture;

public class Armchair extends Furniture{
    private String size;
    public Armchair(String color, String material, String size){
        super(color, material);
        this.size=size;
        cost=300;
    }
    public Armchair(String color, String material, String size, float cost){
        super(color, material,cost);
        this.size=size;
    }

    @Override
    public String toString() {
        return "The armchair is "+size+", "+color+", made of"+material;
    }
}
