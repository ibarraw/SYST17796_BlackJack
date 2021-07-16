/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific child of
 * this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {

    private final String gameName; //the title of the game
    //Not needed as it is only a 1 v 1 game?
    private ArrayList<Player> players;// the players of the game. 

    public Game (String name) {
        this.gameName = name;
        players = new ArrayList();
    }

    /**
     * @return the name
     */
    public String getName () {
        return gameName;
    }

    public void Display () {
        System.out.println("Welcome to " + this.gameName + "!");
    }

    public void askPlayerName () {
        System.out.println("Please enter your name to begin playing: " + this.gameName);
    }

    public void displayRules (Player player) {
        System.out.println("Hi " + player.getName() + ", today you will be playing against the dealer. In order to win, you must achieve a value of 21 or a value higher than the dealer.");
    }

    /**
     * @return the players of this game
     */
//    public ArrayList<Player> getPlayers () {
//        return players;
//    }
//
//    /**
//     * @param players the players of this game
//     */
//    public void setPlayers (ArrayList<Player> players) {
//        this.players = players;
//    }

    /**
     * Play the game. This might be one method or many method calls depending on
     * your game.
     */
    public void play (Dealer dealer, Player player) {



    }

    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public void declareWinner (Dealer dealer, Player player) {

    }

}//end class
