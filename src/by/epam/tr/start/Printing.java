package by.epam.tr.start;

import java.util.Scanner;

public class Printing {
    public enum COVER {hard, soft};

    private String name;
    private String publisher;
    private COVER cover;
    private boolean isTaken;
    private String takenBy;

    public Printing(String name, String publisher, COVER cover, boolean isTaken, String takenBy) {
        this.setName(name);
        this.setPublisher(publisher);
        this.setCover(cover);
        this.setTaken(isTaken);
        this.setTakenBy(takenBy);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public COVER getCover() {
        return cover;
    }
    public void setCover(COVER cover) {
        this.cover = cover;
    }

    public boolean isTaken() {
        return isTaken;
    }

    public void setTaken(boolean isTaken) {
        this.isTaken = isTaken;
    }

    public String getTakenBy() {
        return takenBy;
    }

    public void setTakenBy(String takenBy) {
        this.takenBy = takenBy;
    }

    public void printAsList() {
        System.out.println("Name: " + name);
        System.out.println("Publisher: " + publisher);
        System.out.println("Cover: " + cover);
        System.out.println("Is taken: " + isTaken);
        if(isTaken == true)
            System.out.println("Taken by: " + takenBy);
    }

    public void printAsRow() {
        System.out.print("|" + name + "|" + publisher + "|" + cover + "|" + isTaken + "|" + takenBy + "|");
    }
}