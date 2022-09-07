package ru.mirea.task5.furniture;

public class Table extends Furniture{
    private String size;
    public Table(String color, String material, String size){
        super(color, material);
        this.size=size;
        cost=680;
    }
    public Table(String color, String material, String size, float cost){
        super(color, material,cost);
        this.size=size;
    }

    @Override
    public String toString() {
        return "The table is "+size+", "+color+", made of"+material;
    }
}
