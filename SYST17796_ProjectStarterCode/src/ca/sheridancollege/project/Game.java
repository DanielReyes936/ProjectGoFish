package ca.sheridancollege.project;

import java.util.*;

/**
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 */
public class Game {
	private Player[] noOfPlayers;
	private Game[] gamer;
	int namePlayer;
	int requestCard;
	Player requestPlayer;
	Player prevPlayer;
	Card matchingRank;
	private int cSuit;
	private int cRank;
	boolean gameEnd = true;
	int noPlayer;
	GroupofCards dk;
	public void noOfPlayers()
	{
    	Scanner input = new Scanner(System.in);
    	noPlayer = 0;
    	while((noPlayer <= 1) || (noPlayer >= 7))
		{
        	System.out.println("How many players want to play");
        	noPlayer = input.nextInt();
    	}
    	noOfPlayers = new Player[noPlayer];
    	for (int i1 = 0; i1 < noPlayer; i1++)
		{
        	System.out.println("MyPlayer Number(MyPlayer" + i1 + ")");
        	namePlayer = input.nextInt();
        	noOfPlayers[i1] = new Player(namePlayer);
    	}
    	requestPlayer = noOfPlayers[0];
	}
	public Player turn(Player PA)
	{
    	System.out.println(PA);
    	Scanner input = new Scanner(System.in);
    	int player;
    	int cRank;
    	int numMatches = 0;
    	System.out.println("Player " + PA.getPlayerNo() + " turn");
    	player = 7;
    	while(player >= noPlayer)
		{
        	System.out.println("Which player Do you want to ask?");
        	player = input.nextInt();
    	}
    	player = PA.getPlayerNo();
    	while(player == PA.getPlayerNo())
		{
        	System.out.println("Which player do you want to ask?");
        	player = input.nextInt();
    	}
		requestPlayer = noOfPlayers[player];
    	System.out.println("What rank do you want(2-10 = the corresponding number rank on the card, 11 = jack, 12 = queen, 13 = king, 14 = ace)");
    	cRank = input.nextInt();
    	for(int i1 = 0; i1 < (requestPlayer.getNoOfHandCards()); i1++)
		{
        	if((requestPlayer.handCards[i1].getRank()) == cRank)
			{
            	requestPlayer.handCards[i1].testA();
            	System.out.println("Card of rank " + cRank + " are being transfered");
            	for(int j1 = 0; j1 < (requestPlayer.getNoOfHandCards()); j1++)
				{
                	PA.cardTransfer(i1, requestPlayer);
                	requestPlayer.cardRemove(i1);
            	}
            	PA.findBook();
            	return PA;
        	}
			else
			{
            	System.out.println("Go Fish");
            	PA.cardAdd(dk.dDraw());
            	if((PA.handCards[PA.getNoOfHandCards()-1].getRank()) == cRank)
				{
                	return PA;
            	}
				else
				{
                	System.out.println("Requested Players turn");
                	return requestPlayer;
            	}
        	}
    	}
    	return requestPlayer;
	}
	public void winnerGet()
	{
    	int winner = 0;
    	for(int i1 = 0; i1 < noOfPlayers.length-1; i1++)
		{
        	if((noOfPlayers[i1].getBookNo()) > noOfPlayers[i1+1].getBookNo())
			{
            	winner = (noOfPlayers[i1].getBookNo());
            	System.out.println("MyPlayer " + winner +" won");
        	}
    	}
	}
	public void gameStart()
	{
    	noOfPlayers();
    	dk = new GroupofCards();
    	dk.dShuffle();
    	for(int i1 = 0; i1 < noOfPlayers.length;i1++)
		{
        	for(int j1 = 0; j1 < 5;j1++)
			{
            	noOfPlayers[i1].cardAdd(dk.dDraw());
        	}
    	}
		Player presentPlayer = noOfPlayers[0];;
    	while(gameEnd)
		{
        	presentPlayer = turn(presentPlayer);
        	if(dk.gettopCard() == 52)
			{
            	(new Game()).winnerGet();
             	break;
        	}
        	for(int i1 = 0; i1 < noOfPlayers.length; i1++)
			{
            	if((noOfPlayers[i1].getNoOfHandCards()) == 0)
				{
                	gameEnd = false;                   
            	}
        	}            
    	}           
	}
	public static void main(String[] args)
	{
    	(new Game()).gameStart();
	}
}
