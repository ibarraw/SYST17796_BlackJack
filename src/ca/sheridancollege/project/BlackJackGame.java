/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ca.sheridancollege.project;

/**
 * This class +++Insert Description Here+++
 *
 * @author Xianjun Wang July 2021
 */
public class BlackJackGame {
    
    public static void main(String[] args) {
       
        BlackJackCard[] cardGroup = GroupOfCards.generateBlackJackCard(52);
        
        for (int i=0; i<52; ++i){
            System.out.println(i);
            System.out.println(cardGroup[i]);
        }
        
        System.out.println("*****************************************************");
        GroupOfCards.shuffle();
        
         for (int i=0; i<52; ++i){
      
            System.out.println(52-i);
            System.out.println(cardGroup[i]);
        }
        
    }

}
