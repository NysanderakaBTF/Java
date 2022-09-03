package ru.mirea.task2.Ball;

public class Bal {
    private int diametr;
    private String model;
    public Bal(){
        diametr=0;
        model="Unnknown";
    }
    public Bal(int size){
        diametr=size;
        model="Unnknown";
    }
    public Bal(int size, String model){
        diametr=size;
        this.model=model;
    }

}
