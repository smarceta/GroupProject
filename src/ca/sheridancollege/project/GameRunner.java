/*
-This Class is resposible for running the game (Main Method)
-All the methods from the other classes are put together here to make the game
run smoothly and without errors
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
   Deck xyz = new Deck(52);
   xyz.fillDeck();
   xyz.shuffle();
   xyz.printFullDeck();
   
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
