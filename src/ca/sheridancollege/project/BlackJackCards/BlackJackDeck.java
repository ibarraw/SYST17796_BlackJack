/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project.BlackJackCards;

import ca.sheridancollege.project.GameBaseCode.GroupOfCards;
import java.util.Random;

/**
 * This class used to create Black Jack deck.
 *
 * @author Xianjun Wang
 */
public class BlackJackDeck extends GroupOfCards{

    private static BlackJackCard[] cards;
    private int cardsIndex;
    
     public BlackJackDeck(int size) {
        super(size);
    }

    //Create an array to hold 52 BlackJack cards.
    public static BlackJackCard[] generateBlackJackCard(int numOfCards) {

        cards = new BlackJackCard[numOfCards];
        int cardsIndex = 0;

        Suit[] suits = Suit.values();

        for (int i = 0; i < suits.length; i++) {
             //assign suits/colors to cards
            Suit suit = suits[i];

            for (int j = 0; j < Value.values().length ; j++) {
                cards[cardsIndex] = new BlackJackCard(suit, Value.values()[j]);
                ++cardsIndex;    
            }
        }
        return cards;
    }
    
    //shuffle the 52 cards in the array to make a random order
    
    public static BlackJackCard[] shuffle() {
        
        int len = cards.length; 
        Random random = new Random();
        
        for (int i = 0; i < cards.length; i++) {  
            int randomValue = i + random.nextInt(len - i);
            BlackJackCard temp = cards[randomValue];
            cards[randomValue] = cards[i];
            cards[i] = temp;
        }
        return cards;
    }
    
     //check if all cards in the cards array were used

    public boolean isEmpty() {
        return cardsIndex == 0;
    }

}
