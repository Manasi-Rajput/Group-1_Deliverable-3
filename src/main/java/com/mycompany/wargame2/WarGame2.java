/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.wargame2;

import com.mycompany.wargame2.model.GameStrategy;
import com.mycompany.wargame2.model.StandardGameStrategy;
import com.mycompany.wargame2.model.WarGame;


/**
 *
 * @author rajpu
 */
public class WarGame2 {

 public static void main(String[] args) {
        // Strategy pattern allows us to change how the game works
        GameStrategy strategy = new StandardGameStrategy();
        WarGame warGame = new WarGame("Player 1", "Player 2", strategy);
        warGame.startGame();
    }
    }
