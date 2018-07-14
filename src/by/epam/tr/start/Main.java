package by.epam.tr.start;

import by.epam.tr.start.Book.GENRE;
import by.epam.tr.start.Printing.COVER;

public class Main {

    public static void main(String[] args) {
        Periodical periodical = new Periodical("Cosmopolitan", "NYC", COVER.soft, true, "John Doe", "19.06.2018");
        Book book_A = new Book("The Green Mile", "Eksmo", COVER.hard, true, "James Acme", "Stephen King", GENRE.mystery, 1998);
        Book book_B = new Book("The Hunger Games", "Eksmo", COVER.hard, false, "", "Suzanne Collins", GENRE.fantasy, 2010);

        Library library = new Library();
        library.addPrintingToList(periodical);
        library.addPrintingToList(book_A);
        library.addPrintingToList(book_B);

        library.printPrintingsAsList();

        library.searchForPrinting();
        library.removePrintingFromList();

        library.printPrintingsAsTable();
    }
}