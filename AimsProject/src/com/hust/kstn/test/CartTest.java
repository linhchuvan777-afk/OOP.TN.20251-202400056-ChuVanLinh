package com.hust.kstn.test;

import com.hust.kstn.models.*;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 19.95, "Animation", "Roger Lucas", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 24.95, "Science Fiction", "George Lucas", 87);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", 29.99, "Action", "Christopher Nolan", 152);

        cart.print();
        cart.addDVD(dvd1, dvd2);
        cart.calculateTotalCost();

        cart.addDVD(dvd3, dvd2);
        cart.print();
        cart.calculateTotalCost();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print();
        cart.calculateTotalCost();
        
        cart.removeDVD(dvd2);
        cart.print();
        cart.calculateTotalCost();
    }
}