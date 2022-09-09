package ru.mirea.task8.shapes20;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Task1 extends JPanel  {
    private Random rand = new Random();
    public Color getRandomColor(){
        return new Color(rand.nextInt(255),rand.nextInt(255),rand.nextInt(255));
    }
    private Shape[] shapes = new Shape[20];
    public void generateShapes(){
        for (int i = 0; i < 20; i++) {
            int ch=rand.nextInt(3);
            if(ch==0){
                shapes[i]= new Circle(rand.nextInt(50), getRandomColor());
                shapes[i].setX(rand.nextInt(900));
                shapes[i].setY(rand.nextInt(900));
            } else if (ch==1) {
                shapes[i]= new Rectangle(rand.nextInt(70),rand.nextInt(70), getRandomColor());
                shapes[i].setX(rand.nextInt(900));
                shapes[i].setY(rand.nextInt(900));
            }
            else if (ch==2) {
                shapes[i]= new Square(rand.nextInt(70), getRandomColor());
                shapes[i].setX(rand.nextInt(900));
                shapes[i].setY(rand.nextInt(900));
            }
        }
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("Task 8/1");
        frame.add(new Task1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setVisible(true);

    }
    public void paint(Graphics g)
    {
        generateShapes();
        for (int i = 0; i < 20; i++) {
            g.setColor(shapes[i].getColor());
            if (shapes[i].getClass().getSimpleName().equals("Square"))
                g.fillRect(shapes[i].getX(), shapes[i].getY(), ((Square)shapes[i]).getWidth(), ((Square)shapes[i]).getWidth());
            else if (shapes[i].getClass().getSimpleName().equals("Rectangle"))
                g.fillRect(shapes[i].getX(), shapes[i].getY(), ((Rectangle)shapes[i]).getWidth(), ((Rectangle)shapes[i]).getHeight());
            else if (shapes[i].getClass().getSimpleName().equals("Circle"))
                g.fillOval(shapes[i].getX(), shapes[i].getY(), ((Circle)shapes[i]).getRadius(), ((Circle)shapes[i]).getRadius());
        }

    }
}
