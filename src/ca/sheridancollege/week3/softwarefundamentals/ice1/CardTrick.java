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
 * Modifier: Zacharri Atillo 991513894
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        int rdmValues;
        int rdmSuits;
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            
            // generate random number values
            rdmValues = (int)(Math.random() * 13) + 1;
            
            // generate random number suits
            rdmSuits = (int)(Math.random() * 4) + 0;
            
            magicHand[i] = new Card();
            magicHand[i].setValue(rdmValues);
            magicHand[i].setSuit(Card.SUITS[rdmSuits]);
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        // test print values in the magicand array
        for(int i = 0; i < magicHand.length; i++){
            System.out.println(String.format("%d %s", magicHand[i].getValue(), magicHand[i].getSuit()));
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        System.out.print("Enter Card Value: ");
        int cardVal = in.nextInt();
        System.out.print("Enter suit: ");
        String suit = in.next();
        
        for(int i = 0; i < magicHand.length; i++){
            if(cardVal == magicHand[i].getValue() && suit.toLowerCase().equals(magicHand[i].getSuit().toLowerCase())){
                System.out.print("\nCARDS MATCH!");
                break;
            }
        }
    }
}
