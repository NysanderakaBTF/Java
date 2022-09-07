package ru.mirea.task3.book;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println("Default book: "+book.getAuthor()+" "+book.getTitle()+" pages: "+book.getPages()+
                " publish year:"+book.getPublishYear());
        Scanner in = new Scanner(System.in);
        System.out.println("Enter title author publish year and num. of pages");
        String title, author;
        int publishYear, pages;
        title=in.next(); author=in.next(); publishYear=in.nextInt(); pages = in.nextInt();
        book.setAuthor(author);
        book.setPages(pages);
        book.setTitle(title);
        book.setPublishYear(publishYear);
        System.out.println("Your book: "+book.getAuthor()+" "+book.getTitle()+" pages: "+book.getPages()+
                " publish year:"+book.getPublishYear());
    }
}
