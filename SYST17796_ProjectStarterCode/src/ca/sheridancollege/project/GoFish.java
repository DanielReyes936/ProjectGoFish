/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;



/**
 *
 * @author Daniel Reyes
 */

 
import java.util.ArrayList; //Java's Collection Framework is really what is
import java.util.Random;
 
public class GoFish
{
    static final Random rng = new Random();
    static private ArrayList<Card> cards;
    static public Player[] Players;
 
    public static Card draw()
	{
		return cards.remove(rng.nextInt(cards.size()));
	}
 
	public static int deckSize()
	{
		return cards.size();
    }
 
    public static void main(String[] args)
    {
 
        cards = new ArrayList<Card>();
        for(int i=0;i<4;i++)
            for(Card c: Card.values())
                cards.add(c);
        Player h = new HumanPlayer();
        Player ai = new CPUPlayer();
        Players = new Player[] {h, ai};
 
        while(Players[0].getNumBooks() + Players[1].getNumBooks() < 13)
        {
            Players[0].haveTurn();
            System.out.println("----------");
            Players[1].haveTurn();
            System.out.println("----------");
        }
 
        int yScore = Players[0].getNumBooks(); int aiScore = Players[1].getNumBooks();
        if (yScore > aiScore)
            System.out.println("Congratulations, you win "+ yScore + " to "+ aiScore +"!");
        else if (aiScore > yScore)
            System.out.println("The terrible AI beat you "+ yScore + " to "+ aiScore +"...");
        else
            System.out.println("It's a tie at "+yScore+" each!");
    }
}
 

 

 

 

