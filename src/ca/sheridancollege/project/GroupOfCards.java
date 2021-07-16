/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you
 * might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for
 * reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author William Ibarra June 2021
 */
public class GroupOfCards {

    //The group of deckOfCards, stored in an ArrayList
    private ArrayList<Card> deckOfCards = new ArrayList<Card>();
    private int numCards;//the numCards of the grouping


    //A method to instantiate a constructor to set the deck numCards of deckOfCards.
    //this code is currently broken as it only inserts King for each suit. Needs attention.
    public GroupOfCards () {
        for (int i = 0; i < Value.values().length; i++) {
            this.getDeckOfCards().add(new Spade(Suit.SPADE, Value.values()[i]));
            this.getDeckOfCards().add(new Club(Suit.CLUB, Value.values()[i]));
            this.getDeckOfCards().add(new Heart(Suit.HEART, Value.values()[i]));
            this.getDeckOfCards().add(new Diamond(Suit.DIAMOND, Value.values()[i]));
            this.numCards += 4; //+=4 because 4 cards are being added each loop. 4 x 13 = 52 for a full deck
        }
    }

    /**
     * @return the numCards of the group of deckOfCards
     */
    public int getNumCards () {
        return numCards;
    }

    /**
     * @param numCards the max numCards for the group of deckOfCards
     */
    public void setNumCards (int numCards) {
        this.numCards = numCards;
    }

    //A method that will shuffle the deckOfCards.
    public void shuffle () {
        Collections.shuffle(deckOfCards);
    }

    /**
     * A method that will get the group of deckOfCards as an ArrayList
     *
     * @return the group of deckOfCards.
     */
    public ArrayList<Card> getDeckOfCards () {
        return deckOfCards;
    }

}//end class
