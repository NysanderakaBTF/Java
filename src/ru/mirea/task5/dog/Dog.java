package ru.mirea.task5.dog;

public abstract class Dog {
    protected String name;
    protected int age;
    public Dog()
    {
        name = "Dog";
        age = 1;
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
    public abstract String toString();

    public int dogAgeIntoHumanAge()
    {
        return age*7;
    }
}
