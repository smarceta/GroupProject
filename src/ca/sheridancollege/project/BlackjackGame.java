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
    public void play() {
        
    }

    public void declareWinner(Dealer dealer, HumanPlayer player) {
        
        dealer.getDealerValue();
        player.getPlayerValue();
        
    }
    //zz

    @Override
    public void declareWinner() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

