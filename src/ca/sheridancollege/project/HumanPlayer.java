/*
-This class is resposible for the human player
-It takes all the data required to make a new player
-It is responsible for all the methods that helps the players make his bets and moves.
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
    ArrayList<BlackJackCard> playerHand = new ArrayList<>();
    private int playerValue;
    
   
   
    HumanPlayer(String name, String gender, int age, double balance){
       
        super("Human");
        this.name = name; 
        this.gender = gender;
        this.age = age;
        this.chips = balance;
        
        
    }
    
    public void playerHit(Deck deck){
        
        playerHand.add(deck.drawCard());
        
    }
    
    public String playerCardResult(Deck deck){
        
        playerHit(deck);  
        
        String output = "";
        String z = "";
        int x = 0; 
        int y = 0;
        
        for(int i = 0; i < playerHand.size(); i++){
            
            y = playerHand.get(i).getValue();
            z = playerHand.get(i).getSuit();
            x += y;
            setPlayerValue(x);
            
            output += "Card " + (i+1) + "\nValue: " + y + " Suit: " + z +"\nTotal: " + x + "\n\n ";
        
        
        
     }
        return output + "\n =============== \n";
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

    /**
     * @return the playerValue
     */
    public int getPlayerValue() {
        return playerValue;
    }

    /**
     * @param playerValue the playerValue to set
     */
    public void setPlayerValue(int playerValue) {
        this.playerValue = playerValue;
    }
    
}
