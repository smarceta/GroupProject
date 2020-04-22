/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * @author dancye
 */
public class Deck 
{
   
    //The group of cards, stored in an ArrayList
    private ArrayList <BlackjackCard> deck;
    final String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                           "K", "A"};
    
    
    public Deck(){
        
    }

    public void fillDeck(){
      
        deck = new ArrayList<>();
        
        for(int i = 0; i < suit.length; i++){
            
            for(int j =0; j < rank.length; j++){
                
            deck.add(new BlackjackCard(suit[i], rank[j])); 
            
            }
         }     
    }
    
    
    //TESTING TO SEE IF IT WORKS - Remove this later
    public void printFullDeck(){
        
        for(Card x : deck){
             System.out.println(x.getSuit() + " of " + x.getRank());
        }   
    }
    
    
    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    
    public void shuffle(){
        
        Collections.shuffle(deck);
    }
    
    public BlackjackCard drawCard(){
        
        shuffle();
        return deck.get(0);
        
    }
    
        
}//end class
