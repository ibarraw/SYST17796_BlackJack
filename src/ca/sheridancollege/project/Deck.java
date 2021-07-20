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
 */
public class Deck extends GroupOfCards {

    //Bulid a BlackJack Card deck
    public Deck () {
        for (int i = 0; i < Suit.values().length; i++) {
            for (int x = 0; x < Value.values().length; x++) {
                cards.add(new BlackJackCard(Suit.values()[i], Value.values()[x]));
            }
        }
        //Shuffle the deck
        shuffle();
    }


    //Deal cards to the dealer or the players. The number of cards dealed will be depend 
    //on the situaiton including starting the game, hit, stay.
    public void deal (int howMany, GroupOfCards hand) {
        //GroupOfCards checkRecipient = new GroupOfCards();
        int high = cards.size() - 1;
        int low = high - howMany;
        for (int i = high; i > low; --i) {
            hand.addCard(cards.get(i));
            cards.remove(i);
        }
    }

    public int checkHandValue (GroupOfCards hands) {
        int total = 0;
        int[] array = new int[hands.getSize()];
        for (int i = 0; i < array.length; i++) {
            array[i] = hands.cards.get(i).value.getNumValue();
            total += array[i];
        }
        return total;
    }

}
