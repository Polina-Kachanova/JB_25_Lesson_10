package by.epam.tr.start;

public class Periodical extends Printing {
    private String releaseDate;

    public Periodical(String name, String publisher, COVER cover, boolean isTaken, String takenBy, String releaseDate) {
        super(name, publisher, cover, isTaken, takenBy);
        this.setReleaseDate(releaseDate);
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void printAsList() {
        System.out.println("Periodical: ");
        super.printAsList();
        System.out.println("Release date: " + releaseDate);
        System.out.println();
    }

    public void printAsRow() {
        super.printAsRow();
        System.out.print("	|	|	|" + releaseDate + "|\n");
    }
}