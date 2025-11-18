package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDisc {

    private static int nbCompactDiscs = 0;

    private final int id;
    private final String title;
    private final String category;
    private final double cost;
    private final List<String> artists;
    private final List<String> directors;
    private final List<Track> tracks;

    public CompactDisc(String title, String category, double cost,
                       String[] artists, String[] directors, Track[] tracks) {
        this.id = ++nbCompactDiscs;
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.artists = new ArrayList<>(Arrays.asList(artists));
        this.directors = new ArrayList<>(Arrays.asList(directors));
        this.tracks = new ArrayList<>(Arrays.asList(tracks));
    }

    // Getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public String getCategory() { return category; }
    public double getCost() { return cost; }
    public List<String> getArtists() { return new ArrayList<>(artists); }
    public List<String> getDirectors() { return new ArrayList<>(directors); }
    public List<Track> getTracks() { return new ArrayList<>(tracks); }

    // Methods
    public void addTrack(Track track) { tracks.add(track); }
    public void removeTrack(Track track) { tracks.remove(track); }

    public int getTotalLength() {
        int total = 0;
        for (Track t : tracks) total += t.getLength();
        return total;
    }

    @Override
    public String toString() {
        return "CompactDisc[" + id + "][" + title + "][" + cost + "][" + category + "]"
                + "\nArtists: " + artists
                + "\nDirectors: " + directors
                + "\nTracks: " + tracks;
    }
}
