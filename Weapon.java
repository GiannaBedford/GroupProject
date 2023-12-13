package com.mycompany.csc422prj;
// Weapon class (base class)
class Weapon {
    private String name;
    private int attack;
    private double accuracy;
    private String killAction;

    public Weapon(String name, int attack, double accuracy, String killAction) {
        this.name = name;
        this.attack = attack;
        this.accuracy = accuracy;
        this.killAction = killAction;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public String getKillAction() {
        return killAction;
    }
}

// RangedWeapon subclass
class RangedWeapon extends Weapon {
    private int numProjectiles;

    public RangedWeapon(String name, int attack, double accuracy, int numProjectiles, String killAction) {
        super(name, attack, accuracy, killAction);
        this.numProjectiles = numProjectiles;
    }

    public int getNumProjectiles() {
        return numProjectiles;
    }
}

// MeleeWeapon subclass
class MeleeWeapon extends Weapon {
    public MeleeWeapon(String name, int attack, double accuracy, String killAction) {
        super(name, attack, accuracy, killAction);
    }
}
