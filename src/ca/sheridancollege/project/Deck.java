/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 * This class is used to create Black Jack deck.
 *
 * @author Xianjun Wang July 2021
 * @modifier Chun Kiu So July 2021
 */
public class Deck extends GroupOfCards{

    //Bulid a BlackJack Card deck
    public Deck() {
        for(Suit suit: Suit.values()){
            for(Value value: Value.values()){
                BlackJackCard card = new BlackJackCard(suit, value, true);               
                cards.add(card);
            }
        }
        //Shuffle the deck
        shuffle();
    }

    
    //Deal cards to the dealer or the players. The number of cards dealed will be depend 
    //on the situaiton including starting the game, hit, stay.
    public void deal(int howMany, GroupOfCards hand){
        int high = cards.size()-1;
        int low = high - howMany;
        for (int i = high; i > low; --i){
            hand.addCard(cards.get(i));
            cards.remove(i);
        }
    }
    
    //checks for the total count of the player's hand
    //if there is an ACE in a player's hand, it can be either have a value of 1 or 11, depending on the total count
    public int checkHandValue (GroupOfCards hands) {
        int total = 0;
        int[] array = new int[hands.getSize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = hands.cards.get(i).value.getNumValue();
            total += array[i];
        }
        for(int i = 0; i < array.length; i++){
            if(hands.cards.get(i).value.getNumValue() == 1 && total < 21){
                total += 10;
            }
        }
        return total;
    }
}
