/*
 *@modifier cloud
 */
package ca.sheridancollege.project;

import java.util.ArrayList;


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
            
            output += "Card " + (i+1) + "\nValue: " + y + " Suit: " + z +"\nTotal: " + x + "\n\n";
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
