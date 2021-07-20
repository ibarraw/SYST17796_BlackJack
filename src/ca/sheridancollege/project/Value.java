package ca.sheridancollege.project;

/**
 * An enum for Card values
 *
 * @author William Ibarra, June 2021
 * @modifier Chun Kiu So July 2021
 */
public enum Value {
    ACE(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10);

    private int numValue;

    //Constructor
    Value (int numValue) {
        this.numValue = numValue;

    }

    public int getNumValue () {
        return numValue;
    }


}
