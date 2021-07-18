/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

import ca.sheridancollege.project.BlackJackCards.BlackJackCard;
import ca.sheridancollege.project.GameBaseCode.GroupOfCards;

/**
 * This class +++Insert Description Here+++
 *
 * @author WXJ
 */
public class PlayBlackJack {
     public static void main(String[] args) {
       
        BlackJackCard[] deck = GroupOfCards.generateBlackJackCard(52);
        
        for (int i=0; i<52; ++i){
            System.out.println(i);
            System.out.println(deck[i]);
        }
        
        System.out.println("*****************************************************");
        GroupOfCards.shuffle();
        
         for (int i=0; i<52; ++i){
      
            System.out.println(52-i);
            System.out.println(deck[i]);
        }
        
    }

}
