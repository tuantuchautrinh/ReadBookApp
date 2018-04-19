package com.example.latitude.bookapp;

public class Book {
    private int ID;
    private String Context;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Book(int ID, String name, String author,String context, int image) {
        this.ID = ID;
        this.Context = context;
        this.name = name;
        this.Author = author;
        this.image = image;
    }

    public String getContext() {
        return Context;
    }

    public void setContext(String context) {
        Context = context;
    }

    private String name;
    private String Author;
    private int image;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setPhone(String phone) {
        this.Author = phone;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
