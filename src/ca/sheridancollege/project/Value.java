package ca.sheridancollege.project;

/**
 * An enum for Card values
 *
 * @author William Ibarra, June 2021
 */
public enum Value {
    ACE(1, "Ace"), TWO(2, "Two"), THREE(3, "Three"), FOUR(4, "Four"), FIVE(5, "Five"), SIX(6, "Six"), SEVEN(7, "Seven"), EIGHT(8, "Eight"), NINE(9, "Nine"), TEN(10, "Ten"), JACK(10, "Jack"), QUEEN(10, "Queen"), KING(10,"King");

    private final int numValue;
    private final String stringValue;

    //Constructor
    Value(int numValue, String stringValue){
        this.numValue = numValue;
        this.stringValue = stringValue;
    }

    public int getNumValue(){
        return numValue;
    }
    
    public String getStringValue(){
        return stringValue;
    }
}
