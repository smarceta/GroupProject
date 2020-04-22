/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Cloud
 */
public class Dealer extends Player{
    
    Dealer(){        
        super("Dealer");        
    }
    
    public void draw(){
        Deck deck = new Deck(52);
        deck.fillDeck();
        deck.shuffle();
        //ArrayList list = deck.deck;
        //Random random = new Random();
        //int randomNum = random.nextInt((52 - 1) + 1) + 1;
        System.out.println(deck.deck.get(0));
        //System.out.println(list.indexOf(randomNum));
    }
    
    @Override
    public void play() {
        System.out.println("yo");
    }
    
}
