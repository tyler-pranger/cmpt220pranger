package BlackJackJava;

public class Card {
	 // Codes for the 4 suits.
    public final static int SPADES = 0,HEARTS = 1,DIAMONDS = 2,CLUBS = 3;                        
    public final static int ACE = 1,JACK = 11,QUEEN = 12,KING = 13;                       
    private final int suit;   //Suit of the cards                     
    private final int value;  //Value of the cards 1-11                    
    public Card(int theValue, int theSuit) {
        value = theValue;
        suit = theSuit;
    }  
    public int getSuit() {
        return suit;
    }
    public int getValue() {
        return value;
    }
    public String getSuitForString() {
        switch ( suit ) {
           case SPADES:   return "Spades";
           case HEARTS:   return "Hearts";
           case DIAMONDS: return "Diamonds";
           case CLUBS:    return "Clubs";
           default:       return "??";
        }
    } 
    public String getValueForString() {
        switch (value) {
           case 1:   return "Ace";
           case 2:   return "2";
           case 3:   return "3";
           case 4:   return "4";
           case 5:   return "5";
           case 6:   return "6";
           case 7:   return "7";
           case 8:   return "8";
           case 9:   return "9";
           case 10:  return "10";
           case 11:  return "Jack";
           case 12:  return "Queen";
           case 13:  return "King";
           default:  return "Unknown";
        }
    } 
    public String toString() {
        return getValueForString() + " of " + getSuitForString();
    }
}