package ru.mirea.task7.movable;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x; this.y=y;
        this.ySpeed=ySpeed; this.xSpeed=xSpeed;
    }

    @Override
    public void moveUp() {
        y+=ySpeed;
    }

    @Override
    public void moveDown() {
        y-=ySpeed;
    }

    @Override
    public void moveLeft() {
        x-=xSpeed;
    }

    @Override
    public void moveRight() {
        x+=xSpeed;
    }
    @Override
    public String toString(){
        return "Point: x: "+x+", y: "+y+", xSpeed: "+xSpeed+", ySpeed: "+ySpeed;
    }
}
