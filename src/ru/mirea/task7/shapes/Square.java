package ru.mirea.task7.shapes;

public class Square extends Rectangle {
    public Square() {
        width = length = 0;
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.width;
    }

    public void setSide(double side) {
        this.width = this.length = side;
    }

    @Override
    public void setWidth(double side) {
        this.length = this.width = side;

    }

    @Override
    public void setLength(double side) {
        this.length = this.width = side;
    }
    @Override
    public String toString(){
        return "Square  color: "+color+", is filled: "+filled+", side: "+width;
    }
}
