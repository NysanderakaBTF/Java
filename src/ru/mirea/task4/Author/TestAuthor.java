package ru.mirea.task4.Author;

public class TestAuthor {

    public static void main(String[] args){
        Author author = new Author("Frank Herbert","--------",'M');
        System.out.println(author.toString());
        System.out.println(author.getEmail());
        System.out.println(author.getName());
        System.out.println(author.getGender());
        author.setEmail("email@email.com");
        System.out.println(author.getEmail());

    }
}
