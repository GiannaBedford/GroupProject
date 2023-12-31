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
public class Teacher extends Survivor
{
    private int health;
    private int damage;
    public boolean dead;
    private Weapon chosenWeapon;

    public Teacher() 
    {
        this.health = 50;
        this.damage = 5;
        this.dead = false;
        //this.chosenWeapon = new MeleeWeapon("Default Melee Weapon", 10, 0.5, "Swing");
    }

    public void chooseWeapon()
     {
        Weapon[] availableWeapons =
        {
            new RangedWeapon("Shotgun", 30, 0.7, 8, "Blast"),
            new RangedWeapon("Submachine gun", 25, 0.8, 20, "Spray"),
            new RangedWeapon("Assault Rifle", 35, 0.75, 30, "Fire"),
            new RangedWeapon("Pistol", 20, 0.9, 1, "Shoot"),
            new MeleeWeapon("Axe", 40, 0.6, "Chop"),
            new MeleeWeapon("Crowbar", 25, 0.2, "Smash"),
            new MeleeWeapon("Frying Pan", 15, 0.85, "Hit")
        };

        Random random = new Random();
        this.chosenWeapon = availableWeapons[random.nextInt(availableWeapons.length)];

        System.out.println("Teacher has chosen the weapon: " + this.chosenWeapon.getName());
        System.out.println("Damage: " + this.chosenWeapon.getAttack());
        System.out.println("Accuracy: " + this.chosenWeapon.getAccuracy());
        if (this.chosenWeapon instanceof RangedWeapon rangedWeapon)
        {
            System.out.println("Num Projectiles: " + rangedWeapon.getNumProjectiles());
        }
        System.out.println("Kill Action: " + this.chosenWeapon.getKillAction());
    }


 @Override
    public void attack(Zombie target) {
          if (isDead()) {
            return; // Skip attacking if the soldier is already dead
        }
          if (this.chosenWeapon == null) {
            chooseWeapon();
        }
        Random random = new Random();
        int hitNum = random.nextInt(10) + 1;
        Zombie zombie = (Zombie) target;

        
            if (!zombie.isDead() && hitNum <= this.chosenWeapon.getAccuracy()) {
                zombie.takeDamage(this.chosenWeapon.getAttack());
                System.out.println("    Teacher attacked " + zombie.getType());
            }
        

        if(zombie.getHealth() <= 0) {
            zombie.setDead(true);
            System.out.println("    Teacher killed " + zombie.getType());
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
        return "Teacher";
    }
}
