/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Kristin
 */
public class CommonInfect extends Zombie
{
    private int health;
    private int damage;
    public boolean dead;

    public CommonInfect() 
    {
        this.health = 30;
        this.damage = 5;
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
}
