/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.GameBaseCode;

import ca.sheridancollege.project.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier Xianjun Wang June 2021
 */
public class GroupOfCards {
    
    private static BlackJackCard[] cards;
    private int cardsIndex;

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

    //return a singular Uno card
    public BlackJackCard drawCard() throws IllegalArgumentException {
        if (isEmpty()) {
            throw new IllegalArgumentException("Cannot draw a card since all cards were used");
        }
        return cards[--cardsIndex];
    }

    //The group of cards, stored in an ArrayList
//    private ArrayList<Card> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int size) {
        this.size = size;
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
//    public ArrayList<Card> getCards() {
//        return cards;
//    }

//    public void shuffle() {
//       Collections.shuffle(cards);
//    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the max size for the group of cards
     */
    public void setSize(int size) {
        this.size = size;
    }

}//end class
