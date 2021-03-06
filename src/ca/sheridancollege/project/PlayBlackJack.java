package ca.sheridancollege.project;
/**
 * Main for BlackJack game
 *
 * @author Xianjun Wang July 2021
 * @modifier Chun Kiu So July 2021
 * @modifier William Ibarra July 2021
 */
public class PlayBlackJack {
    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {

        //Build a deck of 52 cards and print it out
        System.out.println("52 Cards in the deck when the game starts:");
        Deck cardDeck = new Deck();
        cardDeck.printDeck();

        //DealerHand and playerHand hold cards for the dealer and the player
        GroupOfCards dealerHand = new GroupOfCards();
        GroupOfCards playerHand = new GroupOfCards();

        //Deal two cards to the dealer and two cards to the player when start the game.
        cardDeck.deal(2, dealerHand);
        cardDeck.deal(2, playerHand); //deck.deck(int, GroupOfCards hand);

        //Cards left in the deck
        System.out.println("\nCards left in the deck after dealing:");
        cardDeck.printDeck();


        //Cards in dealerHand and playerHand
        System.out.println("\nCards in the dealer's hands:");
        dealerHand.printDeck();
        System.out.println("\nCards in the player's hands:");
        playerHand.printDeck();

        //check player hand value
        System.out.println("Checking player hand value");
        System.out.println(cardDeck.checkHandValue(dealerHand));
        System.out.println(cardDeck.checkHandValue(playerHand));

    }
}
