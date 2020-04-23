/*
-The Deck class is responsible about making the cards.
-It allows the BlackjackCard class to use those cards and make their value.
-It's used to shuffle and fill the deck of cards.
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
    private ArrayList <Card> deck;
    final String[] suit = {"Spades", "Diamonds", "Clubs", "Hearts"};
    final String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q",
                           "K", "A"};
    
    
    private int size = 52;//the size of the grouping    
    
    public Deck(int givenSize)
    {
        size = givenSize;
    }
    
   
    public void fillDeck(){
      
        deck = new ArrayList<Card>();
        
        for(int i = 0; i < rank.length; i++){
            
            for(int j =0; j < suit.length; j++){
                
            deck.add(new BlackjackCard(rank[i], suit[j])); 
            
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
    public ArrayList<Card> showCards()
    {
        return deck;
    }
    
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
    
    public void Deal(int cardAmount){
     
    }
    
    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }
    
    
}//end class
