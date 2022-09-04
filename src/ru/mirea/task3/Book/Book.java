package ru.mirea.task3.Book;

public class Book {
    private String title, author;
    private int publishYear, pages;
    public Book()
    {
        title = "Book";
        author="Unknown";
        publishYear=0; pages=0;
    }
    public Book(String titl, String auth, int year, int pag)
    {
        title = titl;
        author=auth;
        publishYear=year;
        pages=pag;
    }

    public int getPages() {
        return pages;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
