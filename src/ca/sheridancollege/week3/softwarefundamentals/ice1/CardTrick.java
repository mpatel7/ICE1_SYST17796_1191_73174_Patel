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
 * @author Michelle Tran 
 * Student ID: 991530644
 */
public class CardTrick {
    
    private Random gen = new Random();
    
    MyCard luckyCard = new MyCard("SPADE", 10);

    
    public static void main(String[] args){
        
   Scanner input = new Scanner(System.in);
        Card[] magicHand = new Card[7];
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(Math.random()*14);
                 c.setSuit(Card.SUITS[Math.random()*4]);
        }
        

        //insert code to ask the user for Card value and suit, create their card
        System.out.println("Enter value");
        value = input.nextInt();
        input.nextLine();
        System.out.println("Enter suit");
        nSuit = input.nextLine();
        Card myCard = new Card(nSuit, value);
        
        // search magicHand here
        for(Card i: magicHand){
        	if(i.getValue() == Card.getValue() && i.getSuit().compareTo(Card.getSuit()){
        		System.out.println("yes");
        	}
        }

        // and search magicHand here
        //Then report the result here
    }
    
}
 
