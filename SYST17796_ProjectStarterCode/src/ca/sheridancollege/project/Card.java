package ca.sheridancollege.project;

/**
 * @author dancye
 */
public class Card {
	private int cSuit;
	private int cRank;
	public void testA()
	{
   	System.out.println("test");
	}
	public int getSuit()
	{
    	return cSuit;
	}
	public int getRank()
	{
    	return cRank;
	}
	public Card(int cSuit, int cRank)
	{
    	this.cSuit = cSuit;
    	this.cRank = cRank;
	}
	public String toString()
	{
    	String suitStr;
    	if (cSuit == 0)
		{
        	suitStr = "spades";
    	}
		else if (cSuit == 1)
		{
        	suitStr = "hearts";
    	}
		else if (cSuit == 2)
		{
        	suitStr = "clubs";
    	}
		else
		{
        	suitStr = "diamonds";
    	}
    	String rankStr;
    	switch (cRank)
		{
        	case 11:
            	rankStr = "jack";
            	break;
        	case 12:
            	rankStr = "queen";
            	break;
        	case 13:
            	rankStr = "king";
            	break;
        	case 14:
            	rankStr = "ace";
            	break;
        	default:
            	rankStr = "" + cRank;
    	}
    	return rankStr + " of " + suitStr;
	}
	public static void main(String[] args)
	{
    	Card cA = new Card(0, 12);
    	Card cB = new Card(1, 2);  
    	Card cC = new Card(3, 11);
		System.out.println(cA);
    	System.out.println(cB);
    	System.out.println(cC);
       
	}
}

