/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * Student：Weiye Chen
 * Number：991527063
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            magicHand[i] = c;
            
            c.setValue((int)(Math.random()*13)+1);
            
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
        }
       
        
        //insert code to ask the user for Card value and suit, create their card
        Card luckyCard = new Card();

	luckyCard.setValue(3);

	luckyCard.setSuit(Card.SUITS[1]);
        
        System.out.println("Your luckycard is "+luckyCard.getValue()+" of "+luckyCard.getSuit());
        // and search magicHand here
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the card value:");
        
        int value = input.nextInt();
        
        System.out.print("Enter the suit of the card:");
        
        String suit = input.nextLine();
        //Then report the result here
       
        
    }
    
}
