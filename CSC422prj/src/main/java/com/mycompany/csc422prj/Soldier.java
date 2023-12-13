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
        Weapon chosenWeapon = availableWeapons[random.nextInt(availableWeapons.length)];

        System.out.println(chosenWeapon.getName() + " has chosen the weapon: " + chosenWeapon.getName());
        System.out.println("Damage: " + chosenWeapon.getAttack());
        System.out.println("Accuracy: " + chosenWeapon.getAccuracy());
        if (chosenWeapon instanceof RangedWeapon rangedWeapon)
        {
            System.out.println("Num Projectiles: " + rangedWeapon.getNumProjectiles());
        }
        System.out.println("Kill Action: " + chosenWeapon.getKillAction());
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
