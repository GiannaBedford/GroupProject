/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Kristin
 */
public class Soldier extends Survivor
{
    private int health;
    private int damage;
    public boolean dead;

    public Soldier() 
    {
        this.health = 100;
        this.damage = 10;
        this.dead = false;
    }

    public void attack(Zombie target) 
    {
        Zombie zombie = (Zombie) target;
        if (!isDead() && !zombie.isDead()) 
        {
            zombie.takeDamage(getDamage());
        }

        if(zombie.getHealth() <= 0) {
            zombie.setDead(true);
            System.out.println("    Soldier killed " + zombie.getType());
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
        return "Soldier";
    }
}
