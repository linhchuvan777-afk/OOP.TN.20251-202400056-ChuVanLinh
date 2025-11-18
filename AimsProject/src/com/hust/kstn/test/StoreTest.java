package com.hust.kstn.test;

import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;
public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", 19.95, "Animation", "Roger Lucas", 87);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 24.95, "Science Fiction", "George Lucas", 87);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("The Dark Knight", 29.99, "Action", "Christopher Nolan", 152);


        store.addDVD(dvd2);
        store.addDVD(dvd1);
        store.print();

        store.addDVD(dvd3);
        store.print();

        store.removeDVD(dvd3);
        store.removeDVD(dvd1);
        store.print();

        store.removeDVD(dvd2);
        store.print();
    }
}