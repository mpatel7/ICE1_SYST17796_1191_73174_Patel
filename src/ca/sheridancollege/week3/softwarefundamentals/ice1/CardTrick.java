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
 * @coauthor Shane Guther 991529673
 */
public class CardTrick {
    
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        Card luckyCard = new Card();
        
        luckyCard.setSuit("spades");
        luckyCard.setValue(2);
        
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue((int)Math.floor(Math.random() * 12 + 1));
            c.setSuit(Card.SUITS[(int)Math.floor(Math.random() * 3 + 1)]);
            magicHand[i] = c;
        }
        System.out.println("Enter a card value");
        int cardValue = input.nextInt();
        System.out.println("Enter a suit.");
        String suitValue = input.next();

        int count = 0;
        for(int j = 0; j < magicHand.length; j++){
            if(magicHand[j].getValue() == cardValue && magicHand[j].getSuit().equalsIgnoreCase(suitValue)){
                count++;
            } 
        }
        /*If the counter variable is incremented it will prompt the if statement to declare 
        the card is found
        */
        if(count >= 1){
                System.out.println("The card was found!");
            }else{
                System.out.println("The card was not found.");
            }
    }
}
