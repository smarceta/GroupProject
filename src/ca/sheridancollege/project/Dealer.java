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
    private int dealerValue = 0;
    int aceAmount = 0;
    
    
    Dealer(){
        super("Dealer");
   
    }
    
    //PRINT DEALERS INITIAL CARD
    public BlackjackCard initialCard(Deck deck){
        
        dealerHand.add(deck.drawCard());
        
        return dealerHand.get(0);
    }
    
    //ADD A CARD TO THE DEALERS HAND
    public void addHand(Deck deck){
        
        dealerHand.add(deck.drawCard());
    }
    
    //TESTING IF STATEMENTS USING DEALERS HAND METHOD AND GETTING VALUE FROM HAND
    public String dealerCardResult(Deck deck){
        
        addHand(deck);  
        
        String output = "";
        String z = "";
        int x = 0; 
        int y = 0;
        
        for(int i = 0; i < dealerHand.size(); i++){
            
            y = dealerHand.get(i).getValue();
            z = dealerHand.get(i).getSuit();
            x += y;
            
            setDealerValue(x);
            
            output += "Card " + (i+1) + "\n value: " + y + " Suit: " + z +"\nTotal: " + x + "\n\n";
          if(x < 17){
              
              addHand(deck);     
          }else if(x == 21){
              
              output += "\n HOUSE WINS";
          }else if (x > 21){
              
              output += "\n HOUSE BUST";
          }          
        }
        
        return output;
    }

    
        public BlackjackCard dealerLastCardDrawn(Deck deck){
        if(getDealerValue() < 17){
           
            setDealerValue(getDealerValue() + dealerHand.get(dealerHand.size()-1).getValue());
        }
        return dealerHand.get(dealerHand.size()-1);
    }
        
    @Override
    public void play() {
        
    }

    /**
     * @return the dealerValue
     */
    public int getDealerValue() {
        return dealerValue;
    }

    /**
     * @param dealerValue the dealerValue to set
     */
    public void setDealerValue(int dealerValue) {
        this.dealerValue = dealerValue;
    }
    
}
       /*MAYBE USE THIS
            int a = dealerHand.get(0).getValue();
        
        if(a < 16){
            
            addHand(deck);
            System.out.println("Card Added to Hand " + a);
        }
        
        int b = dealerHand.get(1).getValue();
        int c = a + b;
        
        if(c <= 16){
           addHand(deck);
           System.out.println("Card Added to Hand " + b); 
        }
        return c; 
    }*/