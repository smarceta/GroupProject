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
public class BlackJackGame extends Game {

    BlackJackGame(){
     
    super("Blackjack");
    }
    
    @Override
    public void play() {
        
    }

    @Override
    public void declareWinner(Dealer dealer, HumanPlayer player) {
        
        int dealerVal = dealer.getDealerValue();
        int playerVal = player.getPlayerValue();
        boolean playerWin = false;
        if(dealerVal>playerVal){
            playerWin = false;
        } else if(playerVal>dealerVal){
            playerWin = true;
        } else {
            playerWin = false;
        }
        
    }
    //zz
}
