/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

/**
 * A class to be used as the base Card class for the project. Must be general
 * enough to be instantiated for any Card game. Students wishing to add to the
 * code should remember to add themselves as a modifier.
 *
 * @author dancye, 2018
 */
public abstract class Card {
    //default modifier for child classes

    public enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    };

    //ACE 11 represents Ace's value as 11, while Ace1 refers to Ace's value as one
    public enum Order {
        ACE1, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, ACE11, JACK, QUEEN, KING
    };

    private final Suit suit;

    private final Order order;

    //Card for both suits and the order of the cards
    public Card(Suit s, Order o) {
        suit = s;
        order = o;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Order getOrder() {
        return this.order;
    }

    /**
     * Students should implement this method for their specific children classes
     *
     * @return a String representation of a card. Could be an UNO card, a
     * regular playing card etc.
     */
    @Override
    public abstract String toString();
}
