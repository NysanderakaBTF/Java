package ru.mirea.task5.Dish;

public class Cup extends Dish{
    private String purpose;
    public Cup(String size, String material, String purpose)
    {
        super(size, material);
        this.purpose = purpose;
    }
    public Cup(String color, String size)
    {
        super(color, size);
        purpose = "universal";
    }
    @Override
    public String toString() {
        return "Cup is "+", "+size+",made of "+material+" should be used for: "+purpose;
    }
}
