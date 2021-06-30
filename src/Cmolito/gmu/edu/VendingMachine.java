package Cmolito.gmu.edu;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {

    //-- Instantiate Scanner --//
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //-- Variables --//
        boolean done = false;
        ArrayList<Item> selectionHistory = new ArrayList<>();
        VendingMachineContents vendingMachineContents = new VendingMachineContents();

        //-- Looping Menu --//
        displayOptions();
        while (!done) {
            String choice = scanner.nextLine().toUpperCase();
            if (choice.toUpperCase().equals("E")) {
                if (!selectionHistory.isEmpty()) {
                    double total = 0;
                    int count = 1;
                    System.out.println("Thank you for your business!");
                    System.out.println("Receipt: ");
                    for (Item item: selectionHistory) {
                        System.out.println(count + ": " + item.getName());
                        total += item.getCost();
                        count++;
                    }
                    System.out.println("\nTotal: $" + total);
                }
                break;
            } else if (choice.toUpperCase().equals("L")) {
                getList(vendingMachineContents);
            } else if (selection(choice,vendingMachineContents)) {
                System.out.println("\nItem successfully dispensed: " + vendingMachineContents.selection.get(choice).getName());
                selectionHistory.add(vendingMachineContents.selection.get(choice));
            } else if (!selection(choice,vendingMachineContents)) {
                System.out.println("Invalid Entry!");
            }
            System.out.print("\nEnter next selection, 'L' for list, or 'E' to exit: ");
        }
    }//-- End Main --//

    //-- Functions -- //
    public static boolean selection(String args, VendingMachineContents contents) {
        if (contents.selection.containsKey(args)) {
            return true;
        }
        return false;
    }
    public static void displayOptions() {
        System.out.print("\nPlease select one of the following options: " + "\n\nTwo-character combination of 'A-D' & '1-4'" + "\n'L' for list of available items" + "\n'E' to exit" + "\n\nSelection: ");

    }
    public static void getList(VendingMachineContents vending) {
        System.out.println();
        for (Map.Entry<String,Item> entry: vending.selection.entrySet()) {
            System.out.println("Item: " + entry.getValue().getName() + ", Cost: $" + entry.getValue().getCost());
        }
    }

}
