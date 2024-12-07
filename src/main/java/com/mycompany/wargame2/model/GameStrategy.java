/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame2.model;

/**
 *
 * @author rajpu
 */
// LSP: Any class implementing "GameStrategy" can replace it, 
// ensuring the behavior adheres to the interface contract.

// ISP: The interface is minimal and focused, containing only the 
// "playRound" method required for defining game logic.
// DIP: The interface allows higher-level modules to depend on abstractions 
// rather than concrete implementations, improving flexibility.

public interface GameStrategy {
    void playRound(Card card1, Card card2, Player player1, Player player2);
}
