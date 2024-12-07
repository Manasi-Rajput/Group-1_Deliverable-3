/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame2.model;

// SRP: This class focuses solely on defining the standard 
// rules for determining the winner of a round.
// ISP: This class implements only the methods defined in the 
// focused `GameStrategy` interface, avoiding unnecessary complexity.
// DIP: The game logic depends on the `GameStrategy` abstraction, 
// allowing easy substitution of different strategies.


public class StandardGameStrategy implements GameStrategy {

    @Override
    public void playRound(Card card1, Card card2, Player player1, Player player2) {
        if (card1.value() > card2.value()) {
            System.out.println(card1 + " wins the round!");
            // Player 1 wins
            player1.increaseScore();
        } else if (card1.value() < card2.value()) {
            System.out.println(card2 + " wins the round!");
            // Player 2 wins
            player2.increaseScore();
        } else {
            System.out.println("It's a tie!");
        }
    }
}
