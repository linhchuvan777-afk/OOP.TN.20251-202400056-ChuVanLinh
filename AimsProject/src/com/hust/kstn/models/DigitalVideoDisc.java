package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
    private String director;
    private int length;

    public DigitalVideoDisc(String title, double cost, String category, String director, int length) {
        super(title, cost, category); // gọi Disc
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DVD[" + getId() + "] - [" + getTitle() + "] - [" + getCost() + "] - [" + length + "] - ["
                + getCategory() + "] - [" + director + "]";
    }

}

