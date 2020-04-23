/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the code 
 * should remember to add themselves as a modifier.
 * @author dancye, 2018
 * @modifier cloud
 */
public abstract class Card 
{
    private String rank; 
    private String suit; 
    
    Card(){}
    
    /**
     * @return the value
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank
     */
    public void setRank(String rank) {
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
