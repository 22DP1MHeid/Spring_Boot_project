package rvt.exercises;

import java.util.ArrayList;

public class Box implements Packable{
    private int itemCount;
    private double maxWeight;
    private double weight;
    private ArrayList<Packable> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public void add(Packable obj) {
        if (this.maxWeight > this.weight() + obj.weight()) {
            this.items.add(obj);
            this.itemCount += 1;
        }
    }

    public String toString() {
        return "Box: " + itemCount + " items, total weight " + weight + " kg";
    }

    @Override
    public double weight() {
        double weight = 0;
        for (Packable packable : this.items) {
            weight = packable.weight();
        }
        return weight;
    }
}
