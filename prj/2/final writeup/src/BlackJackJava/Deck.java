package BlackJackJava;
   import java.util.*;
   class Deck
   {
      private int numCards = 52;
      private Card[] deck = new Card[numCards];
      Deck() {
         fill();
         shuffle();
      }

      private void fill()
      {
         for (int i = 0; i < deck.length; ++i)
         deck[i] = new Card(i, i);
      }

      public void shuffle()
      {
         Collections.shuffle(Arrays.asList(deck));
      }

      Card drawCard()
      {
         if (numCards < 0)
            return null;
         return deck[--numCards];
      }
	Card dealCard() {
		return null;
	}
}
