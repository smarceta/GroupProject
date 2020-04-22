/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 *
 * @author Cloud
 */
public class GameRunner {
    Scanner sc = new Scanner(System.in);  
    
    public static void main(String [] args) {
 
      
    Scanner sc = new Scanner(System.in);  
    
    System.out.println("Welcome to Blackjack --- Insert Opening Message");
    
    //GameRunner prompt = new GameRunner();
    
    //  prompt.playerInfoInput();    
    
    System.out.print("Please enter your name: ");
    String name = sc.nextLine();
    
    System.out.print("Please enter your gender: ");
    String gender = sc.nextLine();
    
    System.out.print("Please enter your age: ");
    int age = sc.nextInt();
    
    System.out.print("Please enter your balance: ");
    double balance = sc.nextDouble();
    HumanPlayer hPlayer = new HumanPlayer(name, gender, age, balance);
    
    System.out.println("\n----Information Summary----\n" + hPlayer.toString());
  
    System.out.println("\nEnter your bet amount: ");
    double bet = sc.nextDouble();
    
   //Testing 
   System.out.println("\n----Cards In Deck----\n");
   Deck xyz = new Deck();
   xyz.fillDeck();
   //xyz.shuffle();
   xyz.printFullDeck();
   System.out.println(xyz.drawCard());
   
   //Testing to see if dealer can draw card
   System.out.println("\n----Dealer Initial Card----\n");
   Dealer abc = new Dealer();
   System.out.println(abc.addCard(xyz));
   
    }
    
    
    //Allows player to populate player object
   /* public void playerInfoInput(){
    System.out.print("Please enter your name: ");
    String name = sc.nextLine();
    
    System.out.print("Please enter your gender: ");
    String gender = sc.nextLine();
    
    System.out.print("Please enter your age: ");
    int age = sc.nextInt();
    
    System.out.print("Please enter your balance: ");
    double balance = sc.nextDouble();
    HumanPlayer hPlayer = new HumanPlayer(name, gender, age, balance);
    
    System.out.println("\n----Information Summary----\n" + hPlayer.toString());
    }
    
  */  
}
