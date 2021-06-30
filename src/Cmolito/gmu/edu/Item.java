package Cmolito.gmu.edu;

public class Item {
    String name;
    double cost;

    public Item(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }
}
