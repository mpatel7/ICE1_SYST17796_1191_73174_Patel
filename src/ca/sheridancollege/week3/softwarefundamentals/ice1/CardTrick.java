/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.*;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 * 
 * Student: Patrick Coster
 * Student ID : 991317799
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner input = new Scanner (System.in);
        for (int i=0; i<magicHand.length; i++)
        {
            Random rn = new Random();
            
            
            Card c = new Card();
            magicHand[i]=c;
            c.setValue(rn.nextInt(13) + 1);
            c.setSuit(Card.SUITS[rn.nextInt(4)]);
            
            
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        Card luckyCard = new Card();
        luckyCard.setvalue(3);
        luckyCard.setSuit(3);

System.out.println("Pick a card any card: ");
System.out.println("Choose a number between 1-13 and a suit (diamond, heart, spade, club");
int cardValue = input.nextInt();
String cardSuit = input.next(); 

boolean test = false;
for (int i=0; i<magicHand.length; i++)
        { if (cardValue == magicHand[i].getValue() && cardSuit.equals(magicHand[i].getSuit()))
        test = true;
        } 
if (test == true){
    System.out.println("You guessed correctly");}
    else System.out.println("You guessed wrong");
}
                

    }
    

