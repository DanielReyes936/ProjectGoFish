/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ca.sheridancollege.project;

import java.util.Random;


/**
 *
 * @author Daniel Reyes
 */
public class GoFish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //create an array to hold 7 cards
        Card[] Hand = new Card[7];
        
        Random random=new Random();
        //generating a hand of 7 cards
        for (int i=0; i<Hand.length; i++)
        {
           Value value=Value.values()[random.nextInt(13)];
           Suit suit=Suit.values()[random.nextInt(4)];
           Card c = new Card(value,suit) {};
            Hand[i]=c;
        }
        System.out.println("cards in Hand: ");
        for(Card card:Hand) {
            System.out.println("value: "+card.getValue()+ " Suit: "+card.getSuit());
            }
    }

}
