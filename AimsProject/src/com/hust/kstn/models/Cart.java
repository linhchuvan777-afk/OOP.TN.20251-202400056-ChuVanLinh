package com.hust.kstn.models;

public class Cart {
    private static final int MAX_NUMBER_ORDERED = 20;
    private int qtyOrdered;
    private DigitalVideoDisc[] itemsInCart = new DigitalVideoDisc[MAX_NUMBER_ORDERED];

    public void addDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == MAX_NUMBER_ORDERED) {
            System.out.println("The cart is full.");
            return;
        }
        itemsInCart[qtyOrdered++] = disc;
        System.out.println("The disc has been added successfully");
    }

    public void addDVD(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
        if (qtyOrdered + 1 >= MAX_NUMBER_ORDERED) {
            System.out.println("Can't add two more discs");
            return;
        }
        itemsInCart[qtyOrdered] = disc1;
        itemsInCart[qtyOrdered+1] = disc2;
        qtyOrdered += 2;
        System.out.println("Two discs have been added successfully");
    }

    public void addDVD(DigitalVideoDisc... discs) {
        if (discs == null) {
            return;
        }
        if (discs.length == 0) {
            // no discs to add
            return;
        }
        if (discs.length == 1) {
            // fallback to singular function
            addDVD(discs[0]);
            return;
        }

        if (qtyOrdered + discs.length > MAX_NUMBER_ORDERED) {
            System.out.println("Not enough space for all discs");
            return;
        }

        for (DigitalVideoDisc disc : discs) {
            itemsInCart[qtyOrdered] = disc;
            qtyOrdered++;
        }

        System.out.println("All discs have been added successfully");
    }

    public void removeDVD(DigitalVideoDisc disc) {
        if (qtyOrdered == 0) {
            System.out.println("The cart is empty.");
            return;
        }

        for (int i = 0; i < qtyOrdered; i++) {
            if (disc == itemsInCart[i]) {
                for (int j = i; j < qtyOrdered - 1; j++) {
                    itemsInCart[j] = itemsInCart[j + 1];
                }
                itemsInCart[--qtyOrdered] = null; // Nullify last element
                System.out.println("The disc has been removed successfully");
                return;
            }
        }
        System.out.println("The disc was not found in the cart.");
    }

    public double calculateTotalCost() {
        double totalCost = 0.0;
        for (int i = 0; i < qtyOrdered; i++) {
            totalCost += itemsInCart[i].getCost();
        }
        return totalCost;
    }

    public void print() {
        System.out.println("=== Total items in cart: " + qtyOrdered + " ===");
        System.out.println("=== All items in cart ===");

        for (int i = 0; i < qtyOrdered; i++) {
            DigitalVideoDisc item = itemsInCart[i];
            System.out.printf("[Title]: %s, [Cost]: %.2f%n", item.getTitle(), item.getCost());
        }
    }
}
