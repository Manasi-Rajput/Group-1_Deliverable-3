/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame2.model;

/**
 *
 * @author rajpu
 */


public class WarGame {
    private final Player player1;
    private final Player player2;
    private final Deck deck;
    private final GameStrategy strategy;
    private int round;

    public WarGame(String player1Name, String player2Name, GameStrategy strategy) {
        this.player1 = new Player(player1Name);
        this.player2 = new Player(player2Name);
        this.deck = Deck.getInstance();
        this.strategy = strategy;
        this.round = 1;
    }

    // Play a round using the current strategy
    public void playRound() {
        Card card1 = deck.dealCard();
        Card card2 = deck.dealCard();

        if (card1 == null || card2 == null) {
            System.out.println("Not enough cards left to continue.");
            return;
        }

        System.out.println("Round " + round + ":");
        System.out.println(player1.getName() + " drew: " + card1);
        System.out.println(player2.getName() + " drew: " + card2);

        strategy.playRound(card1, card2, player1, player2);  // Pass players to strategy

        // Handle score updates directly if needed (if not handled by strategy)
        if (card1.value() > card2.value()) {
            player1.increaseScore();
        } else if (card1.value() < card2.value()) {
            player2.increaseScore();
        }

        round++;
    }

    // Start the game for 4 rounds
    public void startGame() {
        while (round <= 4) {
            playRound();
        }
        displayFinalScore();
    }

    // Display final score after 4 rounds
    private void displayFinalScore() {
        System.out.println("\nFinal Scores after 4 rounds:");
        System.out.println(player1.getName() + ": " + player1.getScore());
        System.out.println(player2.getName() + ": " + player2.getScore());

        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game!");
            // SRP: Player 1's score is updated here as part of round logic
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game!");
               // SRP: Player 2's score is updated here as part of round logic
        } else {
            System.out.println("It's a tie game!");
        }
    }
}
