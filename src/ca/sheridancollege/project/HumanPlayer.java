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
public class HumanPlayer extends Player {
    
    private String name;
    private String gender;
    private int age; 
    private double chips; 
   
   
    HumanPlayer(String name, String gender, int age, double balance){
       
        super("Human");
        this.name = name; 
        this.gender = gender;
        this.age = age;
        this.chips = balance;
        
        
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
        
       String playerInfo = String.format("Name: \t%10s\nGender: \t%s\nAge: \t%10d\nBalance: \t%f\n", getName(), getGender(), getAge(), getChips());
       
       return playerInfo;
    }
    
}
