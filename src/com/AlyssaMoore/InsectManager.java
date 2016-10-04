package com.AlyssaMoore;

import java.util.LinkedList;

public class InsectManager {

    public static void main(String[] args) {

        // Creating two butterfly objects
        Butterfly monarch = new Butterfly("Monarch", 4, 6, "orange and black", "milkweed");
        Butterfly yellowSwallowtail = new Butterfly("Yellow Swallowtail", 4, 6, "yellow and black", "milk parsley");

        // Creating two bee objects
        Bee honeyBee = new Bee("Honey bee", 4, 6, "yellow and black", true, "jasmine");
        Bee bumbleBee = new Bee("Bumble bee", 4, 6, "yellow, black, and white", false, "clover");

        // Creating a linkedList and adding all insect objects
        LinkedList<Insect> insects = new LinkedList<Insect>();
        insects.add(monarch);
        insects.add(yellowSwallowtail);
        insects.add(honeyBee);
        insects.add(bumbleBee);

        // looping over linkedList and printing species data for each insect object
        for (Insect i : insects) {
            System.out.println(i.printSpeciesData());
        }
    }
}