package com.company.book;

public class Guide extends Book {

    private String directoryClassification;

    public Guide(Integer cipher, String author, String title, Integer year,
                 String publishingHouse, String directoryClassification) {
        super(cipher, author, title, year, publishingHouse);
        this.directoryClassification = directoryClassification;
    }

    @Override
    public void display() {
        System.out.println("Ищем информацию о справочнике и выводим на экран...");
    }

    @Override
    public String toString() {
        return "Guide {" +
                "directoryClassification='" + directoryClassification + '\'' +
                ", cipher=" + cipher +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    public String getDirectoryClassification() {
        return directoryClassification;
    }

    public void setDirectoryClassification(String directoryClassification) {
        this.directoryClassification = directoryClassification;
    }
}
