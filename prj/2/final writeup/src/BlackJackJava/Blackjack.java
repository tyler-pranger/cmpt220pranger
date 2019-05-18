package BlackJackJava;

import java.util.Scanner;

public class Blackjack {
    
    private static final String next = null;
	public static void main(String[] args) {
    
       int money;          
       int bet;            
       boolean playerWins;   
       
       System.out.println("Welcome to a blackjack java program.");
       
       // User starts with $200.
       money = 200; 
	   
	   Scanner input = new Scanner(System.in);
    
       while (true) {
           System.out.println("You have " + money + " dollars.");
           do {
              System.out.print("How much money do you want to bet?  (Enter 0 to end.)");
            //Unsure on how to fix .getlnInt in order to carry over input
              bet = input.nextInt();
              if (bet < 0 || bet > money)
                  System.out.println("Your answer must be between 0 and " + money + '.');
           } while (bet < 0 || bet > money);
        	   if (bet == 0) {
        		   break;
        	   }
           boolean playerWins1 = playBlackjack();
           if (playerWins1)
              money = money + bet;
           else
              money = money - bet;
           System.out.println();
           if (money == 0) {
              System.out.println("Too bad, you're out of money.");
              break;
           }
       }
       
       System.out.println();
       System.out.println("You leave with $" + money + ".");
    }
    static boolean playBlackjack() {
       Deck deck;
       Dealer dealerHand;  
       Dealer userHand;
       deck = new Deck();
       dealerHand = new Dealer();
       userHand = new Dealer();
       // Shuffle the deck, then deal two cards to the player and dealer
       deck.shuffle();
       dealerHand.addCard(((Deck) deck).dealCard());
       dealerHand.addCard(((Deck) deck).dealCard());
       userHand.addCard(((Deck) deck).dealCard());
       userHand.addCard(((Deck) deck).dealCard());  
       
       if (dealerHand.getBlackJackValue() == 21) {
            System.out.println("Dealer has the " + dealerHand.getCard(0)+ " and the " + dealerHand.getCard(1) + ".");
            System.out.println("User has the " + userHand.getCard(0) + " and the " + userHand.getCard(1) + ".");
            System.out.println();
            System.out.println("Dealer has a Blackjack. Dealer wins.");
            return false;
       }
       
       if (userHand.getBlackJackValue() == 21) {
            System.out.println("Dealer has the " + dealerHand.getCard(0) + " and the " + dealerHand.getCard(1) + ".");
            System.out.println("User has the " + userHand.getCard(0) + " and the " + userHand.getCard(1) + ".");
            System.out.println("You have Blackjack.  You win.");
            return true;
       }    
	   
	   Scanner input = new Scanner(System.in);
       while (true) {
            // Display player's cards, and let user decide to hit or pass
            System.out.println("Your hand is:");
            for ( int i = 0; i < userHand.getCardCount(); i++ )
               System.out.println("    " + userHand.getCard(i));
            System.out.println("Your total is " + userHand.getBlackJackValue());
            System.out.println();
            System.out.println("Dealer is showing the " + dealerHand.getCard(0));
            System.out.println();
            System.out.print("Hit (H) or Pass (P)? ");
            char userAction;
            do {
            //Unsure on how to fix .getlnChar to carry over the input
               userAction = Character.toUpperCase( input.next().charAt(0) );
               if (userAction != 'H' && userAction != 'P')
                  System.out.print("Please respond H or P:  ");
            	} 
            while (userAction != 'H' && userAction != 'P');

            if ( userAction == 'S' ) {
                break;
            }
            else {  
                Card newCard = deck.dealCard();
                userHand.addCard(newCard);
                System.out.println("User hits.");
                System.out.println("Your card is the " + newCard);
                System.out.println("Your total is now " + userHand.getBlackJackValue());
                // If the user goes over 21, the user loses.
                if (userHand.getBlackJackValue() > 21) {
                    System.out.println("You've gone over 21. Busted! You lose.");
                    System.out.println("Dealer's remaining card was the " + dealerHand.getCard(1));
                    return false;  
                }
            }       
       }
       // If user passes on any new cards, but does not receive 21 points
       System.out.println("User passes.");
       System.out.println("Dealer's cards are");
       System.out.println("    " + dealerHand.getCard(0));
       System.out.println("    " + dealerHand.getCard(1));
       while (dealerHand.getBlackJackValue() <= 16) {
          Card newCard = ((Deck) deck).dealCard();
          System.out.println("Dealer hits and gets the " + newCard);
          dealerHand.addCard(newCard);
          // Dealer receives over 21 points
          if (dealerHand.getBlackJackValue() > 21) {
             System.out.println();
             System.out.println("Dealer has busted. You win!");
             return true;
          }
       }
       System.out.println("Dealer's total is " + dealerHand.getBlackJackValue());   
       System.out.println();
       if (dealerHand.getBlackJackValue() == userHand.getBlackJackValue()) {
          System.out.println("Dealer wins on a tie. You lose.");
          return false;
       }
       else if (dealerHand.getBlackJackValue() > userHand.getBlackJackValue()) {
          System.out.println("Dealer wins, " + dealerHand.getBlackJackValue() + " points to " + userHand.getBlackJackValue() + ".");
          return false;
       }
       else {
          System.out.println("You win, " + userHand.getBlackJackValue() + " points to " + dealerHand.getBlackJackValue() + ".");
          return true;
       }
 
    }
 }