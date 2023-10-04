package org.exercise_02;

public class Book {
    //1. create Attributes
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    // 2. Create method book
    public Book (String t, String a, String i){
        this.title = t;
        this.author = a;
        this.ISBN = i;
        this.available = true;
    }

    public String getBookInfo(){
        return "Title: " + title + " Author: " + author + "ISBN: " + ISBN;
    }

// 4. isAvailable method

    public boolean isAvailable() {

        return available;
    }
    public void setAvailable(boolean available) {

        this.available = available;
    }
}
