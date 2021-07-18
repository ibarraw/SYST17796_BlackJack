/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project.GameBaseCode;

import ca.sheridancollege.project.BlackJackCards.BlackJackCard;
import ca.sheridancollege.project.BlackJackCards.Suit;
import ca.sheridancollege.project.BlackJackCards.Value;
import java.util.ArrayList;
import static java.util.Collections.shuffle;

/**
 * A concrete class that represents any grouping of cards for a Game. HINT, you might want to subclass this more than
 * once. The group of cards has a maximum size attribute which is flexible for reuse.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @modifier Xianjun Wang July 2021
 */
public class GroupOfCards {
 
    //The group of cards, stored in an ArrayList
    private ArrayList<Card> cards;
    protected int size;//the size of the grouping
    

    public GroupOfCards(int size) {
        this.size = size;
        deck(size);      
    }
    
    public ArrayList<Card> deck(int size){
        cards = new ArrayList<>();
        ArrayList<Card> temps = new ArrayList<>();
        
        for(int i = 0; i<Suit.values().length; i++){
            for (int x = 0; x<Value.values().length; x++){
                temps.add(new BlackJackCard(Suit.values()[i], Value.values()[x]));
            }    
        }
        shuffle(temps);

        for(int i = 0; i < size; i++){         
             cards.add(i,temps.get(i));          
        }
         return cards;      
    }
    
    public void printDeck() {
        int index = 0;
        for (Card c : cards) {
            System.out.println(index + " "+c);
            index++;
        }
    }

    /**
     * A method that will get the group of cards as an ArrayList
     *
     * @return the group of cards.
     */
    public ArrayList<Card> getCards() {
        return cards;
    }

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
