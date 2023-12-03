/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;
import java.util.*;

/**
 *
 * @author Kristin
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

    public void displayStats() {

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
        displayStats();
        System.out.println("It seems " + remainingSurvivors + " have made it to safety");
    }

    public void lose() {
        System.out.println("We have " + this.numSurvivors + " survivors trying to make it to safety.");
        System.out.println("But there are " + this.numZombies + " zombies waiting for them.");
        displayStats();
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
}
