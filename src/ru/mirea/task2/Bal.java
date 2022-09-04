package ru.mirea.task2;

public class Bal {
    private float diametr;
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
    public void setDiametr(float c)
    {
        diametr = c;
    }
    public void setModel(String name)
    {
        model = name;
    }
    @Override
    public String toString()
    {
        return "Ball diametr is "+diametr+" and model is "+model;
    }

}
