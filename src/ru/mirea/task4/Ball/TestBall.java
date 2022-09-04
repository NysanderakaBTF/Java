package ru.mirea.task4.Ball;

public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball();
        System.out.println("Default "+ball.toStringBall());
        Ball b1 = new Ball(1.3 ,9.4);
        System.out.println(b1.toStringBall());
        b1.move(8.654, 14.54);
        System.out.println("Moved: "+b1.toStringBall());
    }
}