/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author Michelle Tran 
 * Student ID: 991530644
 */
public class CardTrick {
    
    private Random gen = new Random();

    
    public static void main(String[] args){
        Card[] magicHand = new Card[7];
        int r =0;
        for (int i=0; i<magicHand.length; i++){
            Card c = new Card();
            c.setValue(r);
            c.getValue();
     public String selectRandomCardRank() {
        String cardRank;
        int r = 1 + gen.nextInt(13);
        switch (r) {
        case 1:
            cardRank = "Ace";
            break;
        case 2:
            cardRank = "2";
            break;
        case 3:
            cardRank = "3";
            break;
        case 4:
            cardRank = "4";
            break;
        case 5:
            cardRank = "5";
            break;          
        case 6:
            cardRank = "6";
            break;
        case 7:
            cardRank = "7";
            break;
        case 8:
            cardRank = "8";
            break;
        case 9:
            cardRank = "9";
            break;
        case 10:
            cardRank = "10";
            break;
        case 11:
            cardRank = "Jack";
            break;
        case 12:
            cardRank = "Queen";
            break;          
        default:
            cardRank = "King";
            break;
        }
        return cardRank;
    }
     
//(insert call to random number generator here)
            c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    }
    
}
