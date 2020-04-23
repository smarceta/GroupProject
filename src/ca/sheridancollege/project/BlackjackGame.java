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
public class BlackjackGame extends Game {

    BlackjackGame(){
     
    super("Blackjack");
    }
    
    @Override


    public int declareWinner(Dealer dealer, HumanPlayer player) {
        
        int dealerVal = dealer.getDealerValue();
        int playerVal = player.getPlayerValue();
        
        boolean playerWin = false;
        boolean dealerWin = false;
        
        int winner = 0;
        
        if(dealerVal>playerVal && dealerVal <= 21){
            playerWin = false;
            dealerWin = true;
            
            winner = 1;
            
        } else if(playerVal>dealerVal && playerVal <= 21){
            playerWin = true;
            dealerWin = false;
            
            winner = 2;
        }
        
        if(playerVal > 21 && dealerVal > 21){
         
           winner = 3; 
        }
        
        return winner;
        
        
        
    }
      public void play() {
        
    }
        
    }
    //zz




