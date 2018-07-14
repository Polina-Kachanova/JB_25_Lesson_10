package by.epam.tr.start;

import java.util.Date;

public class Book extends Printing {
    public enum GENRE {scifi, drama, mystery, horror, children, history, biography, fantasy}

    private String author;
    private GENRE genre;
    private int yearPublished;

    public Book(String name, String publisher, COVER cover, boolean isTaken, String takenBy, String author, GENRE genre, int yearPublished) {
        super(name, publisher, cover, isTaken, takenBy);
        this.setAuthor(author);
        this.setGenre(genre);
        this.setYearPublished(yearPublished);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public GENRE getGenre() {
        return genre;
    }

    public void setGenre(GENRE genre) {
        this.genre = genre;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public void printAsList() {
        System.out.println("Book: ");
        super.printAsList();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Year published: " + yearPublished);
        System.out.println();
    }

    public void printAsRow() {
        super.printAsRow();
        System.out.print(author + "|" + genre + "|" + yearPublished + "| 	|\n");
    }
}