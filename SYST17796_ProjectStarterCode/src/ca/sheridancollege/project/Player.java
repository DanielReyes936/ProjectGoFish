package ca.sheridancollege.project;

import java.util.*;

/**
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Player {
	protected Card[] handCards = new Card[25];
	private int noOfHandCards = 0;
	private int playerNo;
	private int booksNo;
	protected boolean[] book = new boolean[12];
	protected int playerNext = 0;
	int b2 = 0, b3 = 0, b4 = 0, b5 = 0, b6 = 0, b7 = 0, b8 = 0, b9 = 0, b10 = 0, b11 = 0, b12 = 0, b13 = 0, b14 = 0;
	int noRank2 = 0, noRank3 = 0, noRank4 = 0, noRank5 = 0, noRank6 = 0, noRank7 = 0, noRank8 = 0, noRank9 = 0, noRank10 = 0, noRank11 = 0, noRank12 = 0, noRank13 = 0, noRank14 = 0;
	public void test()
	{
   	System.out.println("test");
	}
	public Player(int Player)
	{
    	this.playerNo = Player;
    	booksNo = 0;
    	for(int i1 = 0; i1 < 12;i1++)
		{
        	book[i1] = false;
    	}
	}
	public int getNoOfHandCards()
	{
    	return noOfHandCards;
	}
	public int getPlayerNo()
	{
    	return playerNo;
	}
	public int getBookNo()
	{
    	return booksNo;
	}
	public void cardAdd(Card c)
	{  
    	if (noOfHandCards < handCards.length)
		{
        	handCards[noOfHandCards] = c;
        	noOfHandCards++;
    	}
		else
		{
        	System.out.println("Hey, there are no more cards in this deck!");
    	}
	}
	public void cardTransfer(int cRank, Player p)
	{
    	for(int i1 = 0; i1 < p.noOfHandCards; i1++)
		{
        	if((p.handCards[i1].getRank()) == cRank)
			{
            	handCards[noOfHandCards+1] = p.handCards[i1];
        	}
    	}
	}
	public void cardRemove(int index)
	{
    	for (int i1 = 0; i1 < handCards.length;i1++)
		{
        	handCards[index] = null;
    	}
    	for (int i1 = 0; i1 < handCards.length;i1++)
		{
        	if(handCards[index] == null)
			{
             	handCards[index] = handCards[index+1];
        	}
    	}
    	noOfHandCards--;
	}
	public void findBook()
	{
    	int rank2 = 0, rank3 = 0, rank4 = 0, rank5 = 0, rank6 = 0, rank7 = 0, rank8 = 0, rank9 = 0, rank10 = 0, rank11 = 0, rank12 = 0, rank13 = 0, rank14 = 0;
    	for (int i1 = 0; i1 < noOfHandCards; i1++)
		{
        	if((handCards[i1].getRank()) == 2)
			{
            	rank2++;
            	if(rank2 == 4)
				{
                	book[0] = true;
                	booksNo++;
                	if(book[0] == true)
					{
						b2 = 1;
					}
					else
					{
						b2 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 3)
			{
				rank3++;
				if(rank3 == 4)
				{
					book[1] = true;
					booksNo++;
					if(book[0] == true)
					{
						b3 = 1;
					}
					else
					{
						b3 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 4)
			{
				rank4++;
				if(rank4 == 4)
				{
					book[2] = true;
					booksNo++;
					if(book[0] == true)
					{
						b4 = 1;
					}
					else
					{
						b4 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 5)
			{
				rank5++;
				if(rank5 == 4)
				{
					book[3] = true;
					booksNo++;
					if(book[0] == true)
					{
						b5 = 1;
					}
					else
					{
						b5 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 6)
			{
				rank6++;
				if(rank6 == 4)
				{
					book[4] = true;
					booksNo++;
					if(book[0] == true)
					{
						b6 = 1;
					}
					else
					{
						b6 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 7)
			{
				rank7++;
				if(rank7 == 4)
				{
					book[5] = true;
					booksNo++;
					if(book[0] == true)
					{
						b7 = 1;
					}
					else
					{
						b7 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 8)
			{
				rank8++;
				if(rank8 == 4)
				{
					book[6] = true;
					booksNo++;
					if(book[0] == true)
					{
						b8 = 1;
					}   
					else
					{
						b8 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 9)
			{
				rank9++;
				if(rank9 == 4)
				{
					book[7] = true;
					if(book[0] == true)
					{
						b9 = 1;
					}
					else
					{
						b9 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 10)
			{
				rank10++;
				if(rank10 == 4)
				{
					book[8] = true;
					booksNo++;
					if(book[0] == true)
					{
						b10 = 1;
					}
					else
					{
						b10 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 11)
			{
				rank11++;
				if(rank11 == 4)
				{
					book[9] = true;
					booksNo++;
					if(book[0] == true)
					{
						b11 = 1;
					}
					else
					{
						b11 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 12)
			{
				rank12++;
				if(rank12 == 4)
				{
					book[10] = true;
					booksNo++;
					if(book[0] == true)
					{
						b12 = 1;
					}
					else
					{
						b12 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 13)
			{
				rank13++;
				if(rank13 == 4)
				{
					book[11] = true;
					booksNo++;
					if(book[0] == true)
					{
						b13 = 1;
					}
					else
					{
						b13 = 0;
					}
				}
			}
			else if((handCards[i1].getRank()) == 14)
			{
				rank14++;
				if(rank14 == 4)
				{
					book[12] = true;
					booksNo++;
					if(book[0] == true)
					{
						b14 = 1;
					}
					else
					{
						b14 = 0;
					}
				}
			}
		}
		for(int i1 = 0; i1 < book.length;i1++)
		{
			if(book[i1] == true)
			{
				System.out.println("You have a book of rank " + (i1 + 2));
			}
		}
	}
	public String toString()
	{
    	String r1 = "";
    	for (int i1 = 0; i1 < noOfHandCards; i1++)
		{
        	r1 += handCards[i1] + "\n";
    	}
    	return "BOOKs 0 == false and 1 == true" + "\n" +
            	"__________________________________________________________________" + "\n"+
                        	"|" + "   	" + "|" + " 2 " + "|"+ " 3 " + "|" + " 4 " + "|" + " 5 " + "|" + " 6 " + "|"
                        	+ " 7 " + "|" + " 8 " + "|" + " 9 " + "|" + " 10 " + "|" + " 11 " + "|" + " 12 " + "|" + " 13 " + "|" + " 14 " + "|" +"\n" +
                        	"-----------------------------------------------------------------" + "\n" +
                        	"|" + " Books " + "|" + " " + b2 + " " + "|"+ " " + b3 + " " + "|" + " " + b4 + " " + "|" + " " + b5 + " " + "|" + " " + b6 + " " + "|"
                        	+ " " + b7 + " " + "|" + " " + b8 + " " + "|" + " " + b9 + " " + "|" + " " + b10 + " " + "|" + " " + b11 + " " + "|" + " " + b12 + " " + "|" + " " + b13 + " " + "|" + " " + b14 + " "+ "|" +"\n" +
                        	"|________________________________________________________________|" + "\n" + "\n" +
                        	"Cards in Hand" + "\n" + "-------------" + "\n" + r1;
	}
	public static void main(String[] args)
	{
    	Player PA = new Player(0);
    	Player PB = new Player(1);
    	GroupofCards dk = new GroupofCards();
    	dk.dShuffle();
    	for(int i1 = 0; i1 < 1;i1++)
		{
        	for(int j1 = 0; j1 < 5;j1++)
			{
            	PA.cardAdd(dk.dDraw());
            	PB.cardAdd(dk.dDraw());
        	}
    	}
    	System.out.println("player one");
    	System.out.println(PA);
    	System.out.println("player two");
    	System.out.println(PB);
    	PA.cardTransfer(0, PB);
    	System.out.println("player one");
    	System.out.println(PA);
    	System.out.println("player two");
    	System.out.println(PB);
	}
}
