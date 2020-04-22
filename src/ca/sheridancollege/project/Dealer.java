/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Cloud
 */
public class Dealer extends Player{
    
    ArrayList<BlackjackCard> dealerHand = new ArrayList<>();
    int dealerValue = 0;
    int aceAmount = 0;
    Card[] dealerHandA;
    
    
    Dealer(){
        super("Dealer");
   
    }
    
    public BlackjackCard addCard(Deck deck){
        
        dealerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());        
        dealerValue = dealerHand.get(0).getValue() + dealerHand.get(1).getValue();
        return dealerHand.get(1);
        
        
    }
    
    public BlackjackCard dealerHandValue(Deck deck){
        if(dealerValue < 17){
            dealerHand.add(deck.drawCard());
            dealerValue += dealerHand.get(dealerHand.size()-1).getValue();
        }
        return dealerHand.get(dealerHand.size()-1);
    }
    
    @Override
    public void play() {
        
    }
    
}

