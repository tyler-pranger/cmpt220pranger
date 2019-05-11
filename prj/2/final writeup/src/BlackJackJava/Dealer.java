package BlackJackJava;

public class Dealer extends Hand {
 
     public int getBlackJackValue() {
         int val;
         boolean ace;
         int cards;
         val = 0;
         ace = false;
         cards = getCardCount();
         for ( int i = 0;  i < cards;  i++ ) {
                 // Add value of the cards in hand.
             Card card; 
             int cardVal;
             card = getCard(i);
             //Value 1 - 13.
             cardVal = card.getValue();  
             if (cardVal > 10) {
            	 // For a Jack, Queen, or King.
                 cardVal = 10;   
             }
             if (cardVal == 1) {
                 ace = true;    
             }
             val = val + cardVal;
          }

          if (ace == true  &&  val + 10 <= 21)
              val = val + 10;
          	  return val;
     		}
}