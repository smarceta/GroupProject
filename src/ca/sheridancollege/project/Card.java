/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;
import java.util.ArrayList;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 */
public abstract class Card 
{
   private ArrayList suit = new ArrayList();
    
       
       //"Clubs", "Spades", "Diamonds", "Hearts"};
   
    private String[] rank = {"Ace", "King", "Queen", "Jack", "10",
                                   "9", "8", "7", "6", "5", "4", "3", "2"};
    
    Card(){}
    
    /**
     * @return the value
     */
    public int getRank() {
        return rank;
    }

    /**
     * @param value the value to set
     */
    public void setRank(int rank) {
        this.rank = rank;
        
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }
    
    @Override
    public abstract String toString();
    
}
