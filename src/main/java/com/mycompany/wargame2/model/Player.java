/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame2.model;


/**
 *
 * @author rajpu
 */

// SRP: The `Player` class has a single responsibility: 
// managing the player's name and score.
// OCP: The class is open for extension. Additional features like player 
// rank or avatar can be added by subclassing.
// ISP: The class has a focused design with methods relevant 
// only to player-specific operations.

/**
 * Represents a player in the War game.
 * 
 */

public class Player {
    private final String name;
    private int score = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void increaseScore() {
        this.score++;
    }

    public int getScore() {
        return score;
    }

    public void resetScore() {
        this.score = 0;
    }
}
