package com.hust.kstn;

import com.hust.kstn.models.*;
public class Aims {

    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Lucas", 87, 19.95);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", "Action", "Christopher Nolan", 152, 29.99);

        cart.addDVD(dvd1, dvd2);
        cart.print();
        cart.calculateTotalCost();

        cart.addDVD(dvd3, dvd2);
        cart.print();
        cart.calculateTotalCost();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print();
        cart.calculateTotalCost();

        cart.removeDVD(dvd3);
        cart.removeDVD(dvd2);
        cart.print();
        cart.calculateTotalCost();
    }
}