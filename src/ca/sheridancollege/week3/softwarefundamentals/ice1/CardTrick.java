/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Nicholas Di Pietrantonio
 * 991444656
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card(random.nextInt(13)+ 1, Card.SUITS[random.nextInt(4)]);
            magicHand[i] = c;
            
            System.out.println(magicHand[i].getSuit());
            System.out.println(magicHand[i].getValue());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        //insert code to ask the user for Card value and suit, create their card
        /*System.out.println("Pick a card any Card");
        System.out.println("Choose suit: 1.Hearts, 2.Diamonds, 3.Spades, 4.Clubs): ");
        int checkSuit = input.nextInt() - 1;
        System.out.println("Enter number(1-13): ");
        int checkNum = input.nextInt();
        
        Card playerCard = new Card(checkNum, Card.SUITS[checkSuit]);*/
        Card luckyCard = new Card(1, Card.SUITS[0]);
        
        boolean correct = false;
        // and search magicHand here
        for (int i=0; i<magicHand.length; i++)
        {
            correct = magicHand[i].getSuit().equals(/*playerCard*/luckyCard.getSuit()) && 
                    magicHand[i].getValue() == /*playerCard*/luckyCard.getValue();
        }
        //Then report the result here
        if (correct == true){
                System.out.println("The card you guessed was in the deck");
            } else {
                System.out.println("Sorry the card you guessed was not inside the deck");
            }
    }//
    
}
