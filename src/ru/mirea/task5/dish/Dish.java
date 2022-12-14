package ru.mirea.task5.dish;

public abstract class Dish {
    protected String size, material;
    public Dish(String size, String material)
    {
        this.material = material;
        this.size = size;
    }
    public Dish()
    {
        size = "small";
        material = "glass";
    }

    public String getMaterial() {
        return material;
    }
    public String getSize() {
        return size;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setSize(String size) {
        this.size = size;
    }
    @Override
    public abstract String toString();
}
