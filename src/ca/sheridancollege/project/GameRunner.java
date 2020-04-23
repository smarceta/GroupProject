/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * @modifier cloud
 */
package ca.sheridancollege.project;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Cloud
 */
public class GameRunner {
   
    
    public static void main(String [] args) {
 
      
    Scanner sc = new Scanner(System.in);  
    
    System.out.println("Welcome to Blackjack --- Insert Opening Message");  

    HumanPlayer hPlayer = new HumanPlayer(nameCheck(sc), genderCheck(sc), ageCheck(sc), balanceCheck(sc));
    
    System.out.println("\n----Information Summary----\n" + hPlayer.toString());
    
    System.out.println("\n----Bet Status----\n");
    System.out.println("Bet: " + betCheck(sc, hPlayer.getChips()));
    
   //Creating card object and filling a deck 
   Deck xyz = new Deck();
   xyz.fillDeck();
   
   System.out.println("\n----Player Cards----\n");
   System.out.println(playerResults(sc, hPlayer, xyz));
   
   System.out.println("\n----Dealer Cards----\n");
   Dealer abc = new Dealer();
   System.out.println(abc.dealerCardResult(xyz));
   
   System.out.println("----FINAL VALUES----");
   ///FETCHING DEALER VALUE WE SET
   System.out.println("Dealer value: " + abc.getDealerValue());
   
   ///FETCHING PLAYER VALUE WE SET
   System.out.println("Player value: " + hPlayer.getPlayerValue());
   
   
   BlackjackGame bjGame = new BlackjackGame();
   System.out.println(winnerDeclaration(abc, hPlayer, bjGame));
   
    }
    
    
    public static String winnerDeclaration(Dealer dealer, HumanPlayer player, BlackjackGame bjGame){
        
        String winner = "The winner is: ";
        
        if(bjGame.declareWinner(dealer, player) == 1){
            
            winner += " PLAYER WINS";
            
        }else if(bjGame.declareWinner(dealer, player) == 2){
            
            winner += " DEALER WINS";
            
        }else
            winner += "DRAW";
       
        return winner;
        
        
    }
    public static String playerResults(Scanner sc, HumanPlayer hPlayer, Deck deck){
        
        String storeString = "";
        int userValue = 1;
        
      while(hPlayer.getPlayerValue() <= 21){  
        System.out.println("1 == Hit ---- 2 == Stay");  
        userValue = sc.nextInt();
        
        
        while(userValue == 1) {
            
            
             
            System.out.println(storeString);
            System.out.println("1 == Hit ---- 2 == Stay");  
            userValue = sc.nextInt();
            System.out.println("---CURRENT HAND---\n"); 
            storeString += hPlayer.playerCardResult(deck);
            if(hPlayer.getPlayerValue() > 21){
            System.out.println("PLAYER BUST");
                break;
            }
        }
           
        }
        
      
      return storeString;
    }
    
    public static String nameCheck(Scanner sc) {

        String name = "";
        do {
            System.out.print("Please enter you name: ");
            try {
                name = sc.nextLine();
                if (name.matches("[0-9]")) {
                    System.out.println("You must enter a valid name");
                    name = sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Invalid Name, try again");
            }
            return name;
        } while (name.matches("[0-9]"));
    }

    //crashes at exception instead of looping again
    public static int ageCheck(Scanner sc) {

        int age = 0;
        int x = 0;
        do {

            System.out.print("Please enter you age: ");

            try {
                age = sc.nextInt();
                if (age < 18) {
                    System.out.println("Sorry, you must be 18 or older to play this game!");
                    System.exit(0);
                } else {
                    x = 1;
                }

            } catch (Exception e) {
                System.out.println("Invalid entry, try again");
                age = sc.nextInt();
            }
            return age;

        } while (x == 0);

    }

    //just prompt for now
    public static String genderCheck(Scanner sc) {

        String gender = "";
        System.out.print("Please enter you gender: ");
        gender = sc.nextLine();
        return gender;
    }

    //just prompt for now
    public static double balanceCheck(Scanner sc) {

        double balance = 0;
        System.out.print("Please enter you initial balance: ");
        while (balance < 10) {
            try {
                balance = sc.nextDouble();
                if (balance < 10) {
                    System.out.println("Insufficient balance");
                    balance = sc.nextDouble();
                }
            } catch (Exception e) {
                System.out.println("Enter a valid balance");
                balance = sc.nextDouble();
            }
        }
        return balance;
    }

    //just prompt for now - also makes sure bet is not negative DOES NOT LOOP YET
    public static double betCheck(Scanner sc, double balanceCheck) {

        double bet = 0;

        System.out.print("Enter your bet amount: ");
        while (bet > balanceCheck || bet <= 0) {
            try {
                bet = sc.nextDouble();
                if (bet > balanceCheck || bet <= 0) {
                    System.out.println("Insufficient Funds");
                    bet = 0;
                }
            } catch (Exception e) {
                System.out.println("Enter a valid bet amount");
                bet = sc.nextDouble();
            }
        }
        return bet;

    }
}