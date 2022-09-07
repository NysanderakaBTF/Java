package ru.mirea.task6.nameable;

public class Car implements Nameable{
    private String model;
    public Car(String model){
        this.model=model;
    }
    public Car(){
        model = "Unknown";
    }
    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String getName() {
        return null;
    }
}
