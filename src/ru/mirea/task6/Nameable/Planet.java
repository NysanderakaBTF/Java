package ru.mirea.task6.Nameable;

public class Planet implements Nameable{
    private String name;
    public Planet(String name){
        this.name=name;
    }
    public Planet(){
        this.name ="New planet";
    }
    @Override
    public String getName() {
        return name;
    }
}
