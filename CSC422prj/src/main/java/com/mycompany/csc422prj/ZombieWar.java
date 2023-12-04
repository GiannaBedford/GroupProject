/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;
import java.util.*;

/**
 *
 * @author Olivia Cole
 */
public class ZombieWar {
    private ArrayList<Zombie> zombieList;
    private ArrayList<Survivor> survivorList;
    private int numSurvivors;
    private int numZombies;

    ZombieWar() {
        this.zombieList = new ArrayList<>();
        this.survivorList = new ArrayList<>();
    }

    public void createCharacters() {
        Random rand = new Random();
        this.numSurvivors = rand.nextInt(20) + 1;
        this.numZombies = rand.nextInt(20) + 1;

        for(int i = 0; i < this.numSurvivors; i++) {
            int survivorType = rand.nextInt(3);

            if(survivorType == 0) {
                addChild();
            } else if(survivorType == 1) {
                addTeacher();
            } else {
                addSoldier();
            }
        }

        for(int j = 0; j < this.numZombies; j++) {
            int zombieType = rand.nextInt(2);

            if(zombieType == 0) {
                addCommonInfect();
            } else {
                addTank();
            }
        }
    }

    public void fight() {
        for(int i = 0; i < this.numSurvivors; i++) {
            for(int j = 0; j < this.numZombies; j++) {
                this.survivorList.get(i).attack(this.zombieList.get(j));
            }
        }

        for(int k = 0; k < this.numZombies; k++) {
            for(int r = 0; r < this.numSurvivors; r++) {
                this.zombieList.get(k).attack(this.survivorList.get(r));
            }
        }
    }

    public void win() {
        int remainingSurvivors = 0;

        for(int i = 0; i < this.numSurvivors; i++) {
            if(!this.survivorList.get(i).isDead()) {
                remainingSurvivors++;
            }
        }

        System.out.println("We have " + this.numSurvivors + " survivors trying to make it to safety.");
        System.out.println("But there are " + this.numZombies + " zombies waiting for them.");
        //displayStats();
        System.out.println("It seems " + remainingSurvivors + " have made it to safety");
    }

    public void lose() {
        System.out.println("We have " + this.numSurvivors + " survivors trying to make it to safety.");
        System.out.println("But there are " + this.numZombies + " zombies waiting for them.");
        //displayStats();
        System.out.println("None of the survivors made it.");
    }

    private void addCommonInfect() {
        CommonInfect comInfect = new CommonInfect();

        this.zombieList.add(comInfect);
    }

    private void addTank() {
        Tank tank = new Tank();

        this.zombieList.add(tank);
    }

    private void addChild() {
        Child child = new Child();

        this.survivorList.add(child);
    }

    private void addSoldier() {
        Soldier soldier = new Soldier();

        this.survivorList.add(soldier);
    }

    private void addTeacher() {
        Teacher teacher = new Teacher();

        this.survivorList.add(teacher);
    }
    /*public static void main(String[] args) {
        // Release 1.0's sample run
        getRelease1_0();
    } */

    /*
    private static void getRelease1_0() {
        int totalSurvivors = 17;
        int totalZombies = 8;

        // Create survivors
        Survivor[] survivors = new Survivor[totalSurvivors];
        for (int i = 0; i < totalSurvivors; i++) {
            if (i < 5) {
                survivors[i] = new Child("Child" + (i + 1));
            } else if (i < 12) {
                survivors[i] = new Teacher("Teacher" + (i - 4));
            } else {
                survivors[i] = new Soldier("Soldier" + (i - 11));
            }
        }
        // Create zombies
        Zombie[] zombies = new Zombie[totalZombies];
        for (int i = 0; i < totalZombies; i++) {
            if (i % 2 == 0) {
                zombies[i] = new CommonInfected();
            } else {
                zombies[i] = new Tank();
            }
        }

        // escape
        for (Survivor survivor : survivors) {
            for (Zombie zombie : zombies) {
                if (zombie instanceof Tank) {
                    continue;
                }
                if (Math.random() < 0.7) {
                    survivor.makeItToSafety();
                    break;
                }
            }
        }
        // Count the survivors who made it to safety
        int survivorsMadeIt = 0;
        for (Survivor survivor : survivors) {
            if (survivor.hasMadeItToSafety()) {
                survivorsMadeIt++;
            }
        }
        // Display stats
        displayStats(totalSurvivors, totalZombies, survivorsMadeIt);
    } */

    private static void displayStats(int totalSurvivors, int totalZombies, int survivorsMadeIt) {
        System.out.println("We have " + totalSurvivors + " survivors trying to make it to safety.");
        System.out.println("But there are " + totalZombies + " zombies waiting for them.");
        System.out.println("It seems " + survivorsMadeIt + " have made it to safety.");
    }

    public int checkWin() {
        boolean survivorsLeft = false;
        boolean zombiesLeft = false;

        for(int i = 0; i < this.numSurvivors; i++) {
            if(!this.survivorList.get(i).isDead()) {
                survivorsLeft = true;
            }
        }

        for(int i = 0; i < this.numZombies; i++) {
            if(!this.zombieList.get(i).isDead()) {
                zombiesLeft = true;
            }
        }
        System.out.println(zombiesLeft);
        System.out.println(survivorsLeft);

        if(zombiesLeft && survivorsLeft) {
            return 1;
        } else if(survivorsLeft && !zombiesLeft) {
            return 2;
        } else {
            return 3;
        }
    }
}
