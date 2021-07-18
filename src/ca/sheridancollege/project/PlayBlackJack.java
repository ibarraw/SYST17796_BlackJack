/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

import ca.sheridancollege.project.BlackJackCards.CardsGroup;

/**
 * This class +++Insert Description Here+++
 *
 * @author Xianjun Wang July 2021
 */
public class PlayBlackJack {
     public static void main(String[] args) {
        CardsGroup carddeck = new CardsGroup(25);
        carddeck.printDeck();    
    }
}
