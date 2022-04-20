/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
import java.util.ArrayList;

/**
 *
 * @author Daniel Reyes
 */
abstract class Player
{
    protected ArrayList<Card> hand = new ArrayList<Card>();
    private int numBooks;
    public int numcard= hand.size();

    
 
    public Player()
    {
        for(int i=0;i<8;i++)
            fish();
    }
 
    public boolean hasGiven(Card cType)
    {
        return hand.contains(cType);
    }
 
    public ArrayList<Card> giveAll(Card cType)
    {
        ArrayList<Card> x = new ArrayList<Card>(); //Complicated because simply taking the cards as they
        for(int i=0;i<hand.size();i++)            //are found would mess up the traversing of the hand
            if (hand.get(i) == cType)
              x.add(hand.get(i));
        for(int c=0;c<x.size();c++)
            hand.remove(cType);
        return x;
    }
 
    protected boolean askFor(Card cType)
    {
        int tmp = 0;
        if (this instanceof HumanPlayer)
            tmp = 1;
        Player other = GoFish.Players[tmp];
 
        //Used for the computer's strategy//
        if (tmp==1)
            ((CPUPlayer) other).queries.add(cType);
        //                               //
 
        if (other.hasGiven(cType))
        {
            for(Card c: other.giveAll(cType))
                hand.add(c);
            return true;
        }
        else
        {
            return false;
        }
    }
 
    protected void fish()
	    {
	        if (GoFish.deckSize() > 0)
	        	hand.add(GoFish.draw());
	        else
	        	System.out.println("But that's impossible since the deck is empty.");
    }
 
    public int getNumBooks()
    {
        return numBooks;
    }
 
    protected Card checkForBooks()
    {
        for(Card c: hand) //Not very elegant!
        {
            int num = 0;
            for(Card d: hand)
              if (c == d)
                  num++;
            if (num == 4)
            {
                for(int i=0;i<4;i++)
                    hand.remove(c);
                numBooks++;
                return c;
            }
        }
        return null;
 
 
    }
 
    public abstract void haveTurn();

    private static class numcard {

        public numcard() {
        }
    }

   
 
}