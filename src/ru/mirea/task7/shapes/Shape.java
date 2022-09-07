package ru.mirea.task7.shapes;

public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape(){
        color="black";
        filled=true;
    }
    public Shape(String color, boolean filled){
        this.filled=filled;
        this.color=color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    abstract public double getArea();
    abstract public double getPerimeter();
    @Override
    public String toString(){
        return "color: "+color+" if filled: "+filled;
    }
}
