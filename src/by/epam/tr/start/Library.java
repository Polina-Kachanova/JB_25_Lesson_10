package by.epam.tr.start;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    private ArrayList<Printing> printingsList;
    Scanner sc;

    public Library() {
        printingsList = new ArrayList<>();
        sc = new Scanner(System.in);
    }

    public ArrayList<Printing> getPrintingsList() {
        return printingsList;
    }

    public void setPrintingsList(ArrayList<Printing> printingsList) {
        this.printingsList = printingsList;
    }

    public void addPrintingToList(Printing printing) {
        this.printingsList.add(printing);
    }

    public void removePrintingFromList() {
        System.out.print("Enter the name of printing to be removed: ");
        String nameToRemove = sc.nextLine();
        for(Printing printing: printingsList) {
            if(printing.getName().equalsIgnoreCase(nameToRemove)) {
                printingsList.remove(printing);
                System.out.println("The printing is removed!");
                return;
            }
        }
        System.out.println("No such printing!");
    }

    public void searchForPrinting() {
        System.out.print("Enter the name of printing to be searched: ");
        String nameToSearch = sc.nextLine();
        for(Printing printing: printingsList) {
            if(printing.getName().equalsIgnoreCase(nameToSearch)) {
                printing.printAsList();
                return;
            }
        }
        System.out.println("No such printing!");
    }

    public void printPrintingsAsList() {
        System.out.println("The list of printings: ");
        for(Printing printing: printingsList) {
            printing.printAsList();
        }
    }

    public void printPrintingsAsTable() {
        System.out.println("The table of printings: ");
        System.out.println("|Name|Publisher|Cover|Is Taken|Taken By|Author|Genre|Year Published|Release Date|");
        System.out.println("---------------------------------------------------------------------------------");
        for(Printing printing: printingsList) {
            printing.printAsRow();
        }
    }
}