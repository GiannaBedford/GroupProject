/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Hamze Jama
 */
public abstract class Zombie extends Character{
    private String commonInfect;
    private String tank;

    public Zombie() {
        this.commonInfect = "CommonInfect";
        this.tank = "Tank";
    }

    public void setZombieClass(String commonInfect, String tank) {
        this.commonInfect = commonInfect;
        this.tank = tank;
    }

    public ZombieInfo getZombieInfo() {
        return new ZombieInfo(commonInfect, tank);
    }
        boolean isDead() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    void takeDamage(int damage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    abstract void attack(Survivor target);

    // Other methods and members of the Zombie class
}
class ZombieInfo {
    private String commonInfect;
    private String tank;

    public ZombieInfo(String commonInfect, String tank) {
        this.commonInfect = commonInfect;
        this.tank = tank;
    }

    public String getCommonInfect() {
        return commonInfect;
    }

    public String getTank() {
        return tank;
    }
}
