package ru.mirea.task2;

public class Book {
    private String title;
    private float price;
    public Book()
    {
        title = "Book";
        price = 0;
    }
    public Book(String t)
    {
        title = t;
        price = 135.3f;
    }
    public Book(float cost)
    {
        title = "Book";
        price = cost;
    }
    public Book(String t, float cost)
    {
        title = t;
        price = cost;
    }

    public void setTitle(String name)
    {
        title = name;
    }
    public void setPrice(float cost)
    {
        price=cost;
    }
    @Override
    public String toString()
    {
        return "Book's title is "+title+" and it costs "+price+" rub";
    }
}