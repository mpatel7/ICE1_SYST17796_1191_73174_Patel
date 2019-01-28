/*
* Name: Owen Ross
* Student ID: 991484122
*/
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Scanner;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Megha Patel
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        int randomNum;
        
        Scanner in= new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            magicHand[i]=new Card();
            randomNum = 1 + (int)(Math.random() * 13);
            magicHand[i].setValue(randomNum);
            magicHand[i].setSuit("Clubs");
            
            System.out.println("Card no " + (i + 1) + ". is: " + magicHand[i].getValue() + " of " + magicHand[i].getSuit());
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        }
        
        System.out.println("Please pick a card between 1 and 7");
        int userPick = in.nextInt();
        
        System.out.println("You picked the " + magicHand[userPick - 1].getValue() + " of " +  magicHand[userPick - 1].getSuit());
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
