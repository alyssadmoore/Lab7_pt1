package com.AlyssaMoore;

public class Butterfly extends Insect{

    protected String wingColor;
    protected String flower;

    public Butterfly(String name, int wings, int legs, String wingColor, String flower) {
        super(name, wings, legs);
        this.wingColor = wingColor;
        this.flower = flower;
    }

    public String getWingColor() {
        return wingColor;
    }

    public void setWingColor(String wingColor) {
        this.wingColor = wingColor;
    }

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public String printSpeciesData() {
        return ("Name: " + name + ", wing color: " + wingColor + ", num of wings: " +
                wings + ", num legs: " + legs + ", favorite flower: " + flower);
    }
}