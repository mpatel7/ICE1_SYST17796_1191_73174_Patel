/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

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
	    
	Card luckyCard = new Card();
	luckyCard.setValue(11);
	luckyCard.setSuit(Card.SUITS[2]);

	System.out.printf("%-7s%d%n", "Value:", luckyCard.getValue());
	System.out.printf("%-7s%s%n", "Suit:", luckyCard.getSuit());
    }
}
