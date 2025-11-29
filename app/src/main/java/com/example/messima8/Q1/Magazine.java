package com.example.messima8.Q1;

public class Magazine extends LibraryItem implements Searchable, Displayable {

    private int issueNumber;
    private String editorName;


    public Magazine(String title, int yearPublished, int issueNumber, String editorName) {
        super(title, yearPublished);

        this.issueNumber = issueNumber;

        this.editorName = editorName;
    }

    @Override
    public double calculateLateFee(int daysPastDue) {

        return daysPastDue * 2.0;
    }
    @Override
    public boolean matches(String text) {
        String c = getTitle().toLowerCase();
        String d = text.toLowerCase();

        if (c.contains(d)) {
            return true;
        }

        return false;
    }



    @Override
    public void displayFullDetails() {
        System.out.println(toString());
        System.out.println("Issue number: " + issueNumber+ "Editor: " + editorName);
    }
}



