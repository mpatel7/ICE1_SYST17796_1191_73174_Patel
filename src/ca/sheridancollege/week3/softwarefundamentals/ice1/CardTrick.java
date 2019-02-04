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
 */

public class CardTrick {
    
     public static void main(String[] args){
         
       Card[] magicHand = new Card[7];
       int[][] doneCards = new int[7][13];
       Scanner input = new Scanner(System.in);
       Card luckyCard = new Card();
        
       luckyCard.setValue(10);
       luckyCard.setSuit(Card.SUITS[0]);
        
       Random rand = new Random();
        for (int i=0; i<magicHand.length; i++){
            
        Card c = new Card();
        
        int value = 0;
        int suit = 0;
            
            do {
                value = rand.nextInt(12)+1;
                suit = rand.nextInt(3);
            } while (arrayContains(doneCards, suit, value));
            doneCards[i] = new int[]{suit,value};
            
            c.setSuit(Card.SUITS[suit]);
            c.setValue(value);
            
            magicHand[i] = c;
        }
        
       System.out.println("Your Lucky Card is Selected!");
       String cardSuit = input.next();
       int cardValue = input.nextInt();

       Card magicCard = new Card();
       magicCard.setSuit(cardSuit);
       magicCard.setValue(cardValue);
        
       System.out.printf("%d of %s\n",magicCard.getValue(), magicCard.getSuit());
    }
    
    private static boolean arrayContains (int[][] array, int suit, int value){
       boolean contains = false;
       for (int[] card: array){

            if (card[0] == suit && card[1] == value){
                contains = true;
            }
       }
       return contains;
    }
}
