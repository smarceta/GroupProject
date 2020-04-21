/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;
/**
 *
 * @author Cloud
 */
public class BlackjackCard extends Card {

    private int value = 1; 
    
    BlackjackCard(String suit, String Rank){
        
        super();
        super.setSuit(suit);
        super.setRank(Rank);
        
    }

    /**
     * @return the rank
     */
    public int getValue() {
        return value;
    }

    //modify this - probably use switch statement 
    public int setValue(int value) {
        this.value = value;
        
        return value;
                 
    }
    
    @Override
     public String toString() {
      
     String cardDisplay = String.format("-----Your Card-----\n\nSuit: \t%s\nRank: \t%d\nValue: \t%d ", super.getSuit(), super.getRank(), value);
     
     return cardDisplay;
    }   
}
