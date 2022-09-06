package ru.mirea.task5.Dog;

public class Huskey extends Dog{
    private String mood;
    public Huskey(String name, int age, String mood){
        super(name, age);
        this.mood=mood;
    }
    public Huskey(String name, int age){
        super(name, age);
        this.mood="happy";
    }
    public void roll(){
        System.out.println("*rolling on the ground*");
    }
    @Override
    public String toString() {
        return "Huskey's name is "+name+", he is "+age+" y.o "+" and "+mood;
    }
}
