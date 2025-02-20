package org.example;

import java.util.ArrayList;
import java.util.List;

class Box implements Item {
    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Box (Total Price: " + getPrice() + ")";
    }
}