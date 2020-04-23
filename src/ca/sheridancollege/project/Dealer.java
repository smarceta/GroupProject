/*
-This class is responsible for the dealer moves.
-It give the dealer the cards, and if the dealer should takes more cards or not.
-Counts the total value of the dealers cards.
*/
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 *
 * @author Cloud
 */
public class Dealer extends Player {

    ArrayList<BlackjackCard> dealerHand = new ArrayList<>();
    int dealerValue = 0;
    int aceAmount = 0;
    Card[] dealerHandA;

    Dealer() {
        super("Dealer");

    }

    public BlackjackCard addCard(Deck deck) {

        dealerHand.add(deck.drawCard());
        dealerHand.add(deck.drawCard());
        dealerValue = dealerHand.get(0).getValue() + dealerHand.get(1).getValue();
        return dealerHand.get(1);

    }

    public void addHand(Deck deck) {

        dealerHand.add(deck.drawCard());

    }

    public void dealerHandValue(Deck deck) {
        
        
        if (dealerValue < 17) {
            dealerHand.add(deck.drawCard());
        } else if (dealerValue >= 17) {
            
            dealerValue = 0;
            
            for (int i = 0; i < dealerHand.size(); i++) {
                dealerValue += dealerHand.get(i).getValue();
                dealerHand.get(i);
            }
            
            
        }
        
    }

    @Override
    public void play() {

    }

}
