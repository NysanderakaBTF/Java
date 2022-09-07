package ru.mirea.task3.circle;

public class Circle {
    private double radius;
    private double xCord;
    private double yCord;
    public Circle() {
        radius = 0;
        xCord=0; yCord=0;
    }
    public Circle(double rad)
    {
        radius = rad;
        xCord=0; yCord=0;
    }
    public Circle(double radius, double x, double y)
    {
        this.radius = radius;
        xCord=x;
        yCord=y;
    }
    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }

    public double getDist()
    {
        return Math.sqrt(xCord*xCord + yCord*yCord);
    }

    public String toString()
    {
        return "Circle area is "+getArea()+"\nDistance from (0 0) is "+getDist();
    }
}
