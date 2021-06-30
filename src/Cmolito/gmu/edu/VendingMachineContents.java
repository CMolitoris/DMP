package Cmolito.gmu.edu;

import java.util.HashMap;

public class VendingMachineContents {
    HashMap<String, Item> selection;

    public VendingMachineContents() {
        selection = new HashMap<String, Item>();
        selection.put("A1",new Item("Lays",1.25));
        selection.put("A2",new Item("HoneyBun",2.00));
        selection.put("A3",new Item("Doritos",1.50));
        selection.put("A4",new Item("Takis",1.00));

        selection.put("B1",new Item("Snickers",.75));
        selection.put("B2",new Item("Health",1.50));
        selection.put("B3",new Item("Hershey",1.25));
        selection.put("B4",new Item("Twix",1.75));

        selection.put("C1",new Item("Skittles",1.25));
        selection.put("C2",new Item("M&Ms",1.50));
        selection.put("C3",new Item("Butterfinger",1.75));
        selection.put("C4",new Item("Reeses",2.00));

        selection.put("D1",new Item("Water",1.00));
        selection.put("D2",new Item("MountainDew",1.50));
        selection.put("D3",new Item("Sprite",1.50));
        selection.put("D4",new Item("Coca'Cola",1.75));
    }
}
