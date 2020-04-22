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
public class Dealer extends Player{
    
    Dealer(){
        
        super("Dealer");
        
    }
    
    public BlackjackCard draw(){
        
        Deck deckobj = new Deck();
        
        deckobj.fillDeck();
        
        return deckobj.drawCard();
 
    }
    
    @Override
    public void play() {
        
        
        
    }
    
}
