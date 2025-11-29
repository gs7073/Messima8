package com.example.messima8.Q1;
import java.util.UUID;

public abstract class LibraryItem {

    private final UUID itemId;
    private String title;
    private int yearPublished;
    private boolean isBorrowed;

    public LibraryItem(String title, int yearPublished) {
        this.itemId = UUID.randomUUID();
        this.title = title;
        this.yearPublished = yearPublished;
        this.isBorrowed = false;
    }


}