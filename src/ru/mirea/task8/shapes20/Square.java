package ru.mirea.task8.shapes20;

import java.awt.*;

public class Square extends Rectangle {
    public Square(int side , Color color) {
        super(side, side, color);
    }

    public void setSide(int side){
        super.setWidth(side);
        super.setHeight(side);
    }
}
