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
        game.fight();

        int status = game.checkWin();

        while(status == 1) {
            game.fight();
            status = game.checkWin();
        }
        System.out.println(status);

        if(status == 2) {
            game.win();
        } else {
            game.lose();
        }
    }
}
