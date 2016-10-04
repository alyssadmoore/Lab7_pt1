package com.AlyssaMoore;

public class Bee extends Insect{

    protected String color;
    protected boolean honey;
    protected String flower;


    public Bee(String name, int wings, int legs, String color, boolean honey, String flower) {
        super(name, wings, legs);
        this.color = color;
        this.honey = honey;
        this.flower = flower;
    }

    public String printSpeciesData() {
        String makesHoney = "";
        if (honey) {makesHoney = "this bee does make honey";}
        else {makesHoney = "this bee does not make honey";}
        return ("Name: " + name + ", num of wings: " + wings + ", num legs: " + legs +
                ", color: " + color + ", makes honey: " + makesHoney + ", favorite flower: " + flower);
    }
}