package com.example.messima8.Q1;

public class Book extends LibraryItem implements Searchable, Displayable {

    private String author;
    private int numOfPages;

    public Book(String title, int yearPublished, String author, int numOfPages) {
        super(title, yearPublished);
        this.author = author;

        this.numOfPages = numOfPages;
    }

    @Override
    public double calculateLateFee(int daysPastDue) {
        return daysPastDue * 0.5;
    }


    @Override
    public boolean matches(String text) {

        String a = getTitle().toLowerCase();
        String b = text.toLowerCase();

        if (a.contains(b)) {
            return true;
        }

        return false;
    }


    public void displayFullDetails() {
        System.out.println(toString());
        System.out.println("Author: " + author);
        System.out.println("Pages: " + numOfPages);
    }
}

