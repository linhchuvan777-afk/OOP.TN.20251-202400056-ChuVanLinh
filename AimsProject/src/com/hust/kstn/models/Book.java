package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {

    private final int numOfTokens;
    private final List<BookAuthor> authors;

    public Book(String title, double cost, String category, int numOfTokens, List<BookAuthor> authors) {
        super(title, cost, category); // gọi Media
        this.numOfTokens = numOfTokens;
        this.authors = new ArrayList<>(authors);
    }

    public Book(String title, double cost, String category, int numOfTokens, BookAuthor[] authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        this.authors = new ArrayList<>(List.of(authors));
    }

    // Getters
    public int getNumOfTokens() { return numOfTokens; }
    public List<BookAuthor> getAuthors() { return new ArrayList<>(authors); }

    @Override
    public String toString() {
        return "Book[" + getId() + "][" + getTitle() + "][" + getCost() + "][" + getCategory() + "][" + numOfTokens + "]"
                + "\nAuthors: " + authors;
    }
}
