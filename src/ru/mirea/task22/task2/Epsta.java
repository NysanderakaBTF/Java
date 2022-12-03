package ru.mirea.task22.task2;

public class Epsta extends Exception{
    public Epsta(){
        super("Stack is empty! Retry with another expression");
    }
}
