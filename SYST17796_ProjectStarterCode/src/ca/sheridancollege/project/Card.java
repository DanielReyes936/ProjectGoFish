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
   
        private Suit suit;
	private Value value;
        
        // public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
  
         public Card()
         {}
        public Card(Value value, Suit suit )
        {
            this.value=value;
            this.suit=suit;
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

   

	
}
