package ru.mirea.task8.shapes20;

import java.awt.*;

public class Rectangle extends Shape{
    protected int width, height;

    public Rectangle(int width, int height, Color color) {
        this.color = color;
        this.width=width;
        this.height=height;
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
