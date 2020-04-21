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
    
    BlackjackCard(){
        super();
    }

    /**
     * @return the rank
     */
    public int getValue() {
        return value;
    }

    
    public int setValue(int value) {
        this.value = value;
        
        if(super.getRank() > 10){
            value = 10; 
        }else if(super.getRank() == 1){
            value = 1;
        }else if(super.getRank() == 11){
            value = 11; 
        }else 
            value = super.getRank();
        
        return value;
               
        
    }
    @Override
     public String toString() {
      return null;
        
    }   
}
