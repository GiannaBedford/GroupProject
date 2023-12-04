/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Hamze Jama
 */
public abstract class Survivor extends Character{
    private String child;
    private String soldier;
    private String teacher;

    public Survivor() {
        this.child = "Child";
        this.soldier = "Soldier";
        this.teacher = "Teacher";
    }

    public void setSurvivorClass(String child, String soldier, String teacher) {
        this.child = child;
        this.soldier = soldier;
        this.teacher = teacher;
    }

    public SurvivorInfo getSurvivorInfo() {
        return new SurvivorInfo(child, soldier, teacher);
    }
    boolean isDead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    abstract void takeDamage(int damage);

    abstract void attack(Zombie target);

    abstract int getHealth();

    abstract void setDead(boolean dead);

    abstract String getType();
}

class SurvivorInfo {
    private String child;
    private String soldier;
    private String teacher;

    public SurvivorInfo(String child, String soldier, String teacher) {
        this.child = child;
        this.soldier = soldier;
        this.teacher = teacher;
    }

    public String getChild() {
        return child;
    }

    public String getSoldier() {
        return soldier;
    }

    public String getTeacher() {
        return teacher;
    }
}
