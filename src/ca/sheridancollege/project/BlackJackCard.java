/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 * This class This class is used to models BlackJack card Objects. 
 * 
 * A BlackJack card has a value among:ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
 * NINE, TEN, JACK, QUEEN, KING
 * and it has a suit among:  CLUB, SPADE, DIAMOND, HEART
 * 
 * All together there are 52 cards in a deck.
 *
 * @author WXJ
 */
public class BlackJackCard extends Card{
    public BlackJackCard(Suit suit, Value value) {
        super(suit,value);
    }
     
     public String toString(){
         return getValue() + " "  + getSuit();
     }
}
