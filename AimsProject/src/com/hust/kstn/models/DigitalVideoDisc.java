package com.hust.kstn.models;

public class DigitalVideoDisc
{

    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;
    private static int nbDigitalVideoDiscs = 0;
    private int id;

    private DigitalVideoDisc() {
        this.id = ++nbDigitalVideoDiscs;
    }
    public DigitalVideoDisc(String title)
    {
        this();
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, double cost)
    {
        this();
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, double cost)
    {
        this();
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, double cost)
    {
        this();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "DVD" + "[" + this.id + "] - "
                + "[" + this.title + "] - "
                + "[" + this.cost + "] - "
                + "[" + this.length + "] - "
                + "[" + this.category + "] - "
                + "[" + this.director + "]";
    }

}
