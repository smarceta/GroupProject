/*
-The Card class is the parent class for BlackjackCard class
-It contains the Suits and Ranks that will make the cards
*/
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. 
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
