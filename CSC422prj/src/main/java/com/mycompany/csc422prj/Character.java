/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc422prj;

/**
 *
 * @author Cade Beckers
 */
public class Character {
    private String zombie;
    private String survivor;
    
    public Character() {
        this.zombie = "zombie";
        this.survivor = "survivor";
    }
    
    public void setCharacterType(String zombie, String survivor) {
        this.zombie = zombie;
        this.survivor = survivor;
    }
    
    public CharacterInfo getInfo() {
        return new CharacterInfo(zombie, survivor);
    }
}

class CharacterInfo {
    private String zombie;
    private String survivor;

    public CharacterInfo(String zombie, String survivor) {
        this.zombie = zombie;
        this.survivor = survivor;
    }

    public String getZombie() {
        return zombie;
    }

    public String getSurvivor() {
        return survivor;
    }
}
