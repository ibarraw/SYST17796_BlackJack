package ca.sheridancollege.project;
/**
 * Main for BlackJack game
 *
 * @author William Ibarra
 */
public class StartGame {
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {

        //the below code is commented out for testing purposes. However it is used to start the game.


        //Initialize objects for game, input, and dealer
//        Game playGame = new Game("Blackjack");
//        Scanner input = new Scanner(System.in);
//        Dealer dealer = new Dealer();
//
//        //ask for player name
//        playGame.askPlayerName();
//
//        //initialize player object
//        Player playerName = new Player(input.nextLine());
//
//        //display game rules and start the game
//        playGame.displayRules(playerName);
//        playGame.play(dealer, playerName);


        GroupOfCards checkDeck = new GroupOfCards();
        System.out.println(checkDeck.getNumCards()); //returns 52
        System.out.println(checkDeck.getDeckOfCards()); //THIS NEEDS TO BE FIXED. Currently only returns "KING of (VALUE)"
        System.out.println(checkDeck.getDeckOfCards().size()); //returns 52

        //used for testing purposes. This will print out all the ENUMS for Value
        for (int i = 0; i < Value.values().length; i++) {
            System.out.println(Value.values()[i]);
        }





    }
}
