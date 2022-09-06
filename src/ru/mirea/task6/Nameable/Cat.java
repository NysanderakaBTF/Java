package ru.mirea.task6.Nameable;

public class Cat implements Nameable{
    private String name;
    public Cat(String name){
        this.name=name;
    }
    public Cat(){
        this.name ="Cat";
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

}
