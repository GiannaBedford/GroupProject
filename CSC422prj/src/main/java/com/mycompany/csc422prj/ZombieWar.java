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

    ZombieWar() {
        this.zombieList = new ArrayList<>();
        this.survivorList = new ArrayList<>();
    }

    public void createCharacters() {
        Random rand = new Random();
        int numSurvivors = rand.nextInt(20) + 1;
        int numZombies = rand.nextInt(20) + 1;

        
    }

    public void fight() {

    }

    public void displayStats() {

    }

    public void win() {

    }

    public void lose() {

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
