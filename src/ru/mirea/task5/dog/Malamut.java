package ru.mirea.task5.dog;

public class Malamut extends Dog{
    public Malamut(String name, int age){
        super(name,age);
    }
    @Override
    public String toString() {
        return "The name of this Alaska's malamut is "+name+", he is "+age+" y.o";
    }
}
