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



    public UUID getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }


}