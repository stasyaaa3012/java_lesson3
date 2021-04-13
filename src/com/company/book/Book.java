package com.company.book;

public abstract class Book {

    protected Integer cipher;
    protected String author;
    protected String title;
    protected Integer year;
    protected String publishingHouse;

    public Book(Integer cipher, String author, String title, Integer year, String publishingHouse) {
        this.cipher = cipher;
        this.author = author;
        this.title = title;
        this.year = year;
        this.publishingHouse = publishingHouse;
    }

    public abstract void display();

    public Integer getCipher() {
        return cipher;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setCipher(Integer cipher) {
        this.cipher = cipher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }
}
