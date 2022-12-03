package ru.mirea.task22.task2;

public class DoubleParseException extends Exception{
    public DoubleParseException(){
        super("Wrong value! Try another expression");
    }
}
