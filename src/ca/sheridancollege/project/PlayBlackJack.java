/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import ca.sheridancollege.project.BlackJackCards.Deck;
import ca.sheridancollege.project.GameBaseCode.GroupOfCards;

/**
 * This class is used for Players and Dealer to login and play BlackJack Card
 * game.
 *
 * @author Xianjun Wang July 2021
 */
public class PlayBlackJack {

    public static void main(String[] args) {
        //Bulid a deck of 52 cards and print it out
        System.out.println("52 Cards in the deck when the game starts:");
        Deck cardDeck = new Deck();
        cardDeck.printDeck();

        //DealerHand and playerhand hold cards for the dealer and the player
        GroupOfCards dealerHand = new GroupOfCards();
        GroupOfCards playerHand = new GroupOfCards();

        //Deal two cards to the dealer and two cards to the player when start the game.
        cardDeck.deal(2, dealerHand);
        cardDeck.deal(2, playerHand);
        
        //Cards left in the deck
         System.out.println("\nCards left in the deck after dealing:");
        cardDeck.printDeck();
        
        //Cards in dealerHand and playerHand
        System.out.println("\nCards in the dealer's hands:");
        dealerHand.printDeck();
        System.out.println("\nCards in the player's hands:");
        playerHand.printDeck();
    }
}
