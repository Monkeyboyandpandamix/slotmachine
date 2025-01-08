package edu.guilford;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Instantiate a SlotMachine object with specific values
        SlotMachine customSlotMachine = new SlotMachine("Cherry", "Cherry", "Cherry", 0.75);

        // Create an ArrayList to store SlotMachine objects
        ArrayList<SlotMachine> slotMachines = new ArrayList<>();

        // Add the custom object to the ArrayList
        slotMachines.add(customSlotMachine);

        // Loop to instantiate and add 5 random SlotMachine objects
        for (int i = 0; i < 5; i++) {
            SlotMachine randomSlotMachine = new SlotMachine();
            slotMachines.add(randomSlotMachine);
        }

        // Print all SlotMachine objects in the ArrayList
        System.out.println("Slot Machines:");
        for (SlotMachine slotMachine : slotMachines) {
            System.out.println(slotMachine);
        }

        // Analysis: Count the number of winners
        int winCount = 0;
        for (SlotMachine slotMachine : slotMachines) {
            if (slotMachine.spinAndCheckWin()) {
                winCount++;
            }
        }
        System.out.println("Total wins: " + winCount);
    }
}