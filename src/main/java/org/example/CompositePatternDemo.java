package org.example;

public class CompositePatternDemo {
    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 1500);
        Product p2 = new Product("Phone", 800);
        Product p3 = new Product("Headphones", 200);


        Box smallBox = new Box();
        smallBox.addItem(p2);
        smallBox.addItem(p3);

        Box bigBox = new Box();
        bigBox.addItem(p1);
        bigBox.addItem(smallBox);


        System.out.println("Laptop Price: " + p1.getPrice());
        System.out.println("Small Box Price: " + smallBox.getPrice());
        System.out.println("Big Box Price: " + bigBox.getPrice());
    }
}