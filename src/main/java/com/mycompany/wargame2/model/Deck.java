/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.wargame2.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// SRP: This class is responsible for managing a deck of cards, 
// including initialization, shuffling, and dealing cards.
// OCP: The "Deck" class is open for extension similar to Card class
// Design Pattern: Singleton Pattern ensures a single instance of `Deck` 
// is created and shared across the application.

public class Deck {
    private static Deck instance;
    private List<Card> cards;
//DRY: Loops and encapsulation ensure card generation and shuffling logic 
    private Deck() {
        cards = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
        shuffle();
    }

    public static Deck getInstance() {
        if (instance == null) {
            instance = new Deck();
        }
        return instance;
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (!cards.isEmpty()) {
            return cards.remove(0);
        }
        return null; // No more cards left
    }
}
