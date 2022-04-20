/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general enough to be instantiated for any Card
 * game. Students wishing to add to the code should remember to add themselves as a modifier.
 *
 * @author dancye
 */
public abstract class Card {
    public enum Suit{
    HEARTS,CLUBS,SPADES,DIAMONDS
    }
    public enum Value{
        ASS,ONE, TWO, THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEEN,JACK,QUEEN,KING
    }    
    
    //ENUM
    private final Suit suit;
    private final Value value;
    public Card(Suit suit,Value value)
    {
        this.suit=suit;
        this.value=value;
    }
    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @return the value
     */
    public Value getValue() {
        return value;
    }
    
    
    @Override
    public String toString() {
        return "Card"  + suit + value ;
    }
    

}