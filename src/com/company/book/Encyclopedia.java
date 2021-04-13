package com.company.book;

public class Encyclopedia extends Book {

    private Integer numberOfPages;

    public Encyclopedia(Integer cipher, String author, String title, Integer year,
                        String publishingHouse, Integer numberOfPages) {
        super(cipher, author, title, year, publishingHouse);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void display() {
        System.out.println("Ищем информацию об энциклопедии и выводим на экран...");
    }

    @Override
    public String toString() {
        return "Encyclopedia {" +
                "numberOfPages=" + numberOfPages +
                ", cipher=" + cipher +
                ", author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", year=" + year +
                ", publishingHouse='" + publishingHouse + '\'' +
                '}';
    }

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }
}
