package edu.guilford;

import java.util.ArrayList;
import java.util.Random;

public class SlotMachine {
    private static final String[] FRUITS = {"Apple", "Lemon", "Watermelon", "Cherry"};
    private String fruit1;
    private String fruit2;
    private String fruit3;
    private double jackpotProbability;
    private Random random;

    // Default constructor
    public SlotMachine() {
        random = new Random();
        fruit1 = FRUITS[random.nextInt(FRUITS.length)];
        fruit2 = FRUITS[random.nextInt(FRUITS.length)];
        fruit3 = FRUITS[random.nextInt(FRUITS.length)];
        jackpotProbability = random.nextDouble(); // Random value between 0.0 and 1.0
    }

    // Parameterized constructor
    public SlotMachine(String fruit1, String fruit2, String fruit3, double jackpotProbability) {
        this.fruit1 = fruit1;
        this.fruit2 = fruit2;
        this.fruit3 = fruit3;
        this.jackpotProbability = jackpotProbability;
        random = new Random();
    }

    // Getters and setters
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

    public double getJackpotProbability() {
        return jackpotProbability;
    }

    public void setJackpotProbability(double jackpotProbability) {
        this.jackpotProbability = jackpotProbability;
    }

    // toString method
    @Override
    public String toString() {
        return "SlotMachine{" +
                "fruit1='" + fruit1 + '\'' +
                ", fruit2='" + fruit2 + '\'' +
                ", fruit3='" + fruit3 + '\'' +
                ", jackpotProbability=" + jackpotProbability +
                '}';
    }

    // Helper method: Simulates spinning the slot machine
    public boolean spinAndCheckWin() {
        fruit1 = FRUITS[random.nextInt(FRUITS.length)];
        fruit2 = FRUITS[random.nextInt(FRUITS.length)];
        fruit3 = FRUITS[random.nextInt(FRUITS.length)];

        System.out.println("Slot Machine Result:");
        System.out.println(fruit1 + " | " + fruit2 + " | " + fruit3);

        boolean isWinner = fruit1.equals(fruit2) && fruit2.equals(fruit3);
        if (isWinner) {
            System.out.println("Congratulations! You won!");
        } else {
            System.out.println("Try again!");
        }
        return isWinner;
    }
}