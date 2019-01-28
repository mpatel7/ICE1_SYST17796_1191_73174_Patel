/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @author Bassam Saeed
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue((int)(Math.random() * 13 + 1));
            c.setSuit(Card.SUITS[(int)(Math.random() * 3 + 1)]);

	    magicHand[i] = c;
        }
        
        //insert code to ask the user for Card value and suit, create their card
	System.out.println("Pick a card. Any card.");

	Scanner input = new Scanner(System.in);
	String suit;
	int value;
	boolean found = false;

	while(!found) {
	    System.out.print("Value: ");
	    value = Integer.parseInt(input.nextLine());

	    System.out.print("Suit: ");
	    suit = input.nextLine();

	    for (int i = 0; i < magicHand.length; i++) {
		if (magicHand[i].getValue() == value && magicHand[i].getSuit().equalsIgnoreCase(suit))
		    found = true;
	    }

	    if (!found)
		System.out.println("That card is not in the hand. Try again.");
	}

	System.out.println("You got it!");
    }
}
