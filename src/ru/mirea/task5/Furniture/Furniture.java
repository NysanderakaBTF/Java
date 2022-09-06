package ru.mirea.task5.Furniture;

public abstract class Furniture {
    protected String color;
    protected String material;
    protected float cost;
    public Furniture()
    {
        color = "red";
        material = "pine";
        cost=0;
    }
    public Furniture(String color, String material)
    {
        this.color = color;
        this.material = material;
        cost=0;
    }
    public Furniture(String color, String material, float cost)
    {
        this.color = color;
        this.material = material;
        this.cost=cost;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public abstract String toString();
}
