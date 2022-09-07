package ru.mirea.task5.dish;

public class Bowl extends Dish{
    private String depth;
    public Bowl(String size, String material, String depth)
    {
        super(size, material);
        this.depth=depth;
    }

    public Bowl(String size, String material)
    {
        super(size, material);
        depth="medium";
    }

    @Override
    public String toString()
    {
        return ("This bowl is " +size+" and "+depth+" (depth), made of " +material);
    }
}
