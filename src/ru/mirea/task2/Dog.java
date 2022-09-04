package ru.mirea.task2;

public class Dog {
    private String name;
    private int age;
    public Dog()
    {
        name = "Dog";
        age = 0;
    }
    public Dog(String n, int a)
    {
        name = n;
        age = a;
    }
    public Dog(String n)
    {
        name = n;
        age = 0;
    }
    public Dog(int a){
        name = "Dog";
        age=a;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName ()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
    @Override
    public String toString()
    {
        return "Dog's name is "+name+", age "+age;
    }
    public int dogAgeIntoHumanAge()
    {
        return age*7;
    }
}
