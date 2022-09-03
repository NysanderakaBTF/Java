package ru.mirea.task2.Shape;

public class Shape {
    private String type, color, material;
    public Shape(){
        type="cube";
        color="white";
        material="marble";
    }
    public Shape(String type){
        this.type=type;
        color="white";
        material="marble";
    }
    public Shape(String type, String color){
        this.type=type;
        this.color=color;
        material="marble";
    }
    public Shape(String type, String color,String material){
        this.type=type;
        this.color=color;
        this.material=material;
    }
    public void set_type(String type){
        this.type=type;
    }
    public void set_color(String color){
        this.color=color;
    }
    public void set_material(String material){
        this.material=material;
    }
    public String getType (){
      return type;
    }
    public String getColor (){
        return color;
    }
    public String getMaterial(){
        return material;
    }
    public String toString(){
        return "Shape "+type+" is "+color+" and made of "+material;
    }
}
