package com.AlyssaMoore;

public abstract class Insect {

    protected String name;
    protected int wings;
    protected final int legs = 6;

    public Insect(String name, int wings, int legs) {
        this.wings = wings;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public abstract String printSpeciesData();
}