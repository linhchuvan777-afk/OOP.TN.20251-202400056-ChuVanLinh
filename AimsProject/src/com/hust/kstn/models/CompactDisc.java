package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompactDisc extends Disc {

    private List<String> artists;
    private List<String> directors;
    private List<Track> tracks;

    public CompactDisc(String title, double cost, String category,
                       String[] artists, String[] directors, Track[] tracks) {
        super(title, cost, category); // gọi Disc → Media
        this.artists = new ArrayList<>(Arrays.asList(artists));
        this.directors = new ArrayList<>(Arrays.asList(directors));
        this.tracks = new ArrayList<>(Arrays.asList(tracks));
    }

    // Getters
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
        StringBuilder trackList = new StringBuilder();
        for (Track t : tracks) {
            trackList.append(t).append("\n");
        }
        return "CompactDisc[" + getId() + "][" + getTitle() + "][" + getCost() + "][" + getCategory() + "]"
                + "\nArtists: " + artists
                + "\nDirectors: " + directors
                + "\nTracks:\n" + trackList;
    }
}
