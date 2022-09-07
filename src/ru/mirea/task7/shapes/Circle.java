package ru.mirea.task7.shapes;

public class Circle extends Shape{
    protected double radius;
    public Circle(){
        radius=0;
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*radius;
    }
    @Override
    public String toString(){
        return "Circle color: "+color+", is filled: "+filled+", radius: "+radius;
    }

}
