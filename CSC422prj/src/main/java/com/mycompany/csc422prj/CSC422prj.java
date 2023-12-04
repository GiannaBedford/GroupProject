/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.csc422prj;

/**
 *
 * @author Olivia Cole
 */
public class CSC422prj {

    public static void main(String[] args) {
        ZombieWar game = new ZombieWar();

        game.createCharacters();

        System.out.println("We have " + game.numSurvivors + " survivors(" + game.numChildren + " children, " + game.numTeachers + " teachers, " + game.numSoldiers + " soldiers) trying to make it to safety.");
        System.out.println("But there are " + game.numZombies + " zombies(" + game.numCommonInfect + " common infect, " + game.numTanks + " tank) waiting for them.");

        game.fight();

        int status = game.checkWin();

        while(status == 1) {
            game.fight();
            status = game.checkWin();
        }
        //System.out.println(status);

        if(status == 2) {
            game.win();
        } else {
            game.lose();
        }
    }
}
