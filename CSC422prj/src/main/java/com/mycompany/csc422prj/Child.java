/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Kristin
 */
public class Child extends Survivor
{
    private int health;
    private int damage;
    public boolean dead;

    public Child() 
    {
        this.health = 20;
        this.damage = 2;
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
            System.out.println("    Child killed " + zombie.getType());
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
        return "Child";
    }
}
