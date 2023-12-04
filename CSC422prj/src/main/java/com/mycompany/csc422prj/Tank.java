/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Kristin
 */
public class Tank extends Zombie
{
    private int health;
    private int damage;
    public boolean dead;

    public Tank() 
    {
        this.health = 150;
        this.damage = 20;
        this.dead = false;
    }

    public void attack(Survivor target) 
    {
        Survivor survivor = (Survivor) target;
        if (!isDead() && !survivor.isDead()) 
        {
            survivor.takeDamage(getDamage());
        }

        if(survivor.getHealth() <= 0) {
            survivor.setDead(true);
            System.out.println("    Tank killed " + survivor.getType());
        }
    }

    public int getHealth() 
    {
        return this.health;
    }

    public int getDamage() 
    {
        return this.damage;
    }

    public boolean isDead() 
    {
        return this.dead;
    }

    public void setHealth(int health) 
    {
        this.health = health;
    }

    public void setDamage(int damage) 
    {
        this.damage = damage;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public void takeDamage(int damage) {
        this.health -= damage;
    }

    public String getType() {
        return "Tank";
    }
}
