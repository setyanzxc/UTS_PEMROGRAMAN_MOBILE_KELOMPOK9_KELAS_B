package com.kelompok9.versiandroid;
public class Andro {
    private String androTitle;
    private String androDate;
    private int androImageId;

    public Andro(String androTitle, String androDate, int androImageId) {
        this.androTitle = androTitle;
        this.androDate = androDate;
        this.androImageId = androImageId;
    }

    public String getAndroTitle() {
        return androTitle;
    }

    public String getAndroDate() {
        return androDate;
    }

    public int getAndroImageId() {
        return androImageId;
    }
}
