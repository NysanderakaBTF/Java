package ru.mirea.task22.task2;

public class DivisionByZeroException extends Exception {

    public DivisionByZeroException(){
        super("Division by zero! Retry with another expression");
    }
}
