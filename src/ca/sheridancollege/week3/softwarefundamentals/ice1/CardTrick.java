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
 *
 * @author Megha Patel
 */
import java.util.Scanner;
public class CardTrick
{
   // Modified by: Brian Liman
   // Student Number: 991474732
   public static void main (String[] args)
   {
      Scanner in = new Scanner(System.in);
      Card[] magicHand = new Card[7];
      
      for (int i = 0; i < magicHand.length; i++) {
         Card c = new Card();
         //c.setValue(insert call to random number generator here)
         c.setValue((int) (Math.random() * 12 + 1));
         //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
         c.setSuit(Card.SUITS[(int) (Math.random() * 4)]);
      }

      //insert code to ask the user for Card value and suit, create their card
      // and search magicHand here
      //Then report the result here

      // King of Spade
      System.out.print("Enter a card value: ");
      int cardVal = in.nextInt();
      System.out.print("Enter card suit: ");
      String cardSuit = in.nextLine();
   }
   
}
