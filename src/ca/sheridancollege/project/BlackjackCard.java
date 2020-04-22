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

    private int value; 
    
    BlackjackCard(String suit, String Rank){
        
        super();
        super.setSuit(suit);
        super.setRank(Rank);
        setValue(Rank);
    }

    /**
     * @return the rank
     */
    public int getValue() {
        return value;
    }

    //modify this - probably use switch statement 
    public final void setValue(String rank) {
 
        
        
        switch (rank){
            
            case "2":  value = 2;
            break;
            case "3":  value = 3;
            break;
            case "4":  value = 4;
            break;
            case "5":  value = 5;
            break;
            case "6":  value = 6;
            break;
            case "7":  value = 7;
            break;
            case "8":  value = 8;
            break;
            case "9":  value = 9;
            break;
            case "10": value = 10;
            break;
            case "J":  value = 10;
            break;
            case "Q":  value = 10;
            break;
            case "K":  value = 10;
            break;
            case "A":  value = 11;
            break;
            default: value = 0;
        }
                 
    }
    
    @Override
     public String toString() {
      
     String cardDisplay = String.format("-----Your Card-----\n\nSuit: \t%s\nRank: \t%s\nValue: \t%d ", super.getSuit(), super.getRank(), getValue());
     
     return cardDisplay;
    }   
}
