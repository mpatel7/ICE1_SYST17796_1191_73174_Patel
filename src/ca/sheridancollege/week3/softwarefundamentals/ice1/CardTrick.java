/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * @co-author Roman Krutikov
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        int[][] doneCards = new int[7][2];
        Scanner input = new Scanner(System.in);
        
        Random rand = new Random();
        for (int i=0; i<magicHand.length; i++)
        {
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
            
            System.out.println(Arrays.toString(doneCards[i]));
        }
        
        System.out.println("Tell me your card suit (String) and value (int)");
        String cardSuit = input.next();
        int cardValue = input.nextInt();
        
        Card magicCard = new Card();
        magicCard.setSuit(cardSuit);
        magicCard.setValue(cardValue);
        
        boolean cardExists = false;
        for (Card c: magicHand){
            if (c.getSuit().equals(magicCard.getSuit()) && c.getValue() == magicCard.getValue()){
                cardExists = true;
            }
        }
        if (cardExists){
            System.out.println("Your card was found!");
        }
        else {
            System.out.println("I couldn't find your card");
        }
    }
    
    private static boolean arrayContains (int[][] array, int suit, int value){
        boolean contains = false;
        for (int[] card: array){
            //If there is a match for a card with value and suit
            if (card[0] == suit && card[1] == value){
                contains = true;
            }
        }
        return contains;
    }
}
