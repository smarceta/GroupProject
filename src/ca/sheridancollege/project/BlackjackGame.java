/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @modifier cloud
 */
package ca.sheridancollege.project;


public class BlackjackGame extends Game {

    BlackjackGame(){
     
    super("Blackjack");
    }
    
    @Override


    public int declareWinner(Dealer dealer, HumanPlayer player) {
        
        int dealerVal = dealer.getDealerValue();
        int playerVal = player.getPlayerValue();
        

        
        int winner = 0;
        
        if(dealerVal>playerVal && dealerVal <= 21){
      
            winner = 1;
            
        } else if(playerVal>dealerVal && playerVal <= 21){  
            
            winner = 2;
            
        }else if (playerVal > 21 && dealerVal > 21){
         
           winner = 3; 
        }
        
        return winner;
        
        
        
    }

        
    }
    //zz




