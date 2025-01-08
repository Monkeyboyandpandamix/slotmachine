package edu.guilford;

import java.util.Random;

public class SlotMachine {
    private static final String[] FRUITS = {"Apple", "Lemon", "Watermelon"};
    private String fruit1;
    private String fruit2;
    private String fruit3;
    private int spins;

    private Random random;

    // Constructor that sets random values for all attributes
    public SlotMachine() {
        random = new Random();
        this.fruit1 = FRUITS[random.nextInt(FRUITS.length)];
        this.fruit2 = FRUITS[random.nextInt(FRUITS.length)];
        this.fruit3 = FRUITS[random.nextInt(FRUITS.length)];
        this.spins = 0;
    }

    // Constructor that accepts information from the calling program
    public SlotMachine(String fruit1, String fruit2, String fruit3, int spins) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
        this.fruit3 = fruit3;
        this.spins = spins;
        random = new Random();
    }

    // Getters and setters for all attributes
    public String getFruit1() {
        return fruit1;
    }

    public void setFruit1(String fruit1) {
        this.fruit1 = fruit1;
    }

    public String getFruit2() {
        return fruit2;
    }

    public void setFruit2(String fruit2) {
        this.fruit2 = fruit2;
    }

    public String getFruit3() {
        return fruit3;
    }

    public void setFruit3(String fruit3) {
        this.fruit3 = fruit3;
    }

    public int getSpins() {
        return spins;
    }

    public void setSpins(int spins) {
        this.spins = spins;
    }

    // toString method
    @Override
    public String toString() {
        return "SlotMachine{" +
                "fruit1='" + fruit1 + '\'' +
                ", fruit2='" + fruit2 + '\'' +
                ", fruit3='" + fruit3 + '\'' +
                ", spins=" + spins +
                '}';
    }

    // Helper method to spin the slot machine
    public void spin(int spinNumber) {
        this.fruit1 = FRUITS[random.nextInt(FRUITS.length)];
        this.fruit2 = FRUITS[random.nextInt(FRUITS.length)];
        this.fruit3 = FRUITS[random.nextInt(FRUITS.length)];
        this.spins++;

        System.out.println("Spin " + spinNumber + " Result:");
        System.out.println(fruit1 + " | " + fruit2 + " | " + fruit3);

        if (fruit1.equals(fruit2) && fruit2.equals(fruit3)) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Try again!");
        }
    }

    // Method to check if the current spin is a win
    public boolean isWin() {
        return fruit1.equals(fruit2) && fruit2.equals(fruit3);
    }
}