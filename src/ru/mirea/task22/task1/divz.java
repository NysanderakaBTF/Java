package ru.mirea.task22.task1;

public class divz extends Exception {

    public divz(){
        super("Division by zero! Retry with another expression");
    }
}
