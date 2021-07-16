package ca.sheridancollege.project;
/**
 * Spade will instantiate a constructor of type Card, and return toString
 * equivalent of suit and value.
 *
 * @author William Ibarra June 2021
 */
public class Diamond extends Card {

    public Diamond (Suit suit, Value value) {
        super(suit, value);
    }

    @Override
    public String toString () {
        String cardName = "";
        for (int i = 0; i < Value.values().length; i++) {
            cardName = Value.values()[i].toString() + " of " + Suit.DIAMOND.toString();
        }
        return cardName; //return string in format: VALUE of SUIT
    }

}
