package edu.guilford;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        // Instantiate one object with values for all attributes
        SlotMachine slotMachine1 = new SlotMachine("Apple", "Lemon", "Watermelon", 0);

        // Create an ArrayList to store SlotMachine objects
        ArrayList<SlotMachine> slotMachines = new ArrayList<>();

        // Add the first object to the ArrayList
        slotMachines.add(slotMachine1);

        // Loop to instantiate at least five objects and add them to the ArrayList
        for (int i = 0; i < 5; i++) {
            SlotMachine slotMachine = new SlotMachine();
            slotMachines.add(slotMachine);
        }

        // Variables to keep track of wins and losses
        int wins = 0;
        int losses = 0;

        // Loop to print out all elements of the ArrayList, spin them, and count wins/losses
        for (int i = 0; i < slotMachines.size(); i++) {
            SlotMachine slotMachine = slotMachines.get(i);
            slotMachine.spin(i + 1);
            if (slotMachine.isWin()) {
                wins++;
            } else {
                losses++;
            }
        }

        // Print out the number of wins and losses
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }
}