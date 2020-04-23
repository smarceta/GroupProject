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
public class HumanPlayer extends Player {
    
    private String name;
    private String gender;
    private int age; 
    private double chips;
    ArrayList<BlackjackCard> playerHand = new ArrayList<>();
    
   
   
    HumanPlayer(String name, String gender, int age, double balance){
       
        super("Human");
        this.name = name; 
        this.gender = gender;
        this.age = age;
        this.chips = balance;
        
        
    }
    
    public void addPlayerHand(Deck deck){
        
        playerHand.add(deck.drawCard());
    }
    
    public String playerCardResult(Deck deck){
        
        addPlayerHand(deck);  
        
        String output = "";
        int x = 0; 
        int y = 0;
        for(int i = 0; i < playerHand.size(); i++){
            
            y = playerHand.get(i).getValue();
            x += y;
            output += "Card " + (i+1) + " value: " + y + "\n";
          if(x < 17){
              
              addPlayerHand(deck);     
          }          
        }
        
        return output;
    }
    
    @Override
    public void play(){
        System.out.println("xys");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the chips
     */
    public double getChips() {
        return chips;
    }

    /**
     * @param chips the chips to set
     */
    public void setChips(double chips) {
        this.chips = chips;
    }
    
    public String toString(){
        
       String playerInfo = String.format("Name:\t%11s\nGender: \t%s\nAge: \t%11d\nBalance: \t%f\n", getName(), getGender(), getAge(), getChips());
       
       return playerInfo;
    }
    
}
