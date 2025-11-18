package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book {

    private final String title;
    private final String category;
    private final double cost;
    private final int numOfTokens;
    private final List<BookAuthor> authors;
    static private int nbBooks = 0;
    private final int id;

    public Book(String title, String category, double cost, int numOfTokens, List<BookAuthor> authors) {

        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = new ArrayList<>(authors);
        this.id = ++nbBooks;
    }
    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = new ArrayList<>(List.of(authors));
        this.id = ++nbBooks;
    }


    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public double getCost() {
        return cost;
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    public List<BookAuthor> getAuthors() {
        return new ArrayList<>(authors);
    }
    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Book[" + this.id + "]["
                + this.title + "]["
                + this.cost + "]["
                + this.category + "]["
                + this.numOfTokens + "]"
                + "\nAuthors: " + this.authors;
    }
}