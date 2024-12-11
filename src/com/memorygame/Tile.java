package com.memorygame;

public class Tile {
    private int id;
    private boolean isFlipped;

    public Tile(int id) {
        this.id = id;
        this.isFlipped = false;
    }

    public int getId() {
        return id;
    }

    public boolean isFlipped() {
        return isFlipped;
    }

    public void flip() {
        isFlipped = !isFlipped;
    }
}
