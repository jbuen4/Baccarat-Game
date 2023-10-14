import java.util.ArrayList;
import java.util.Collections;


public class BaccaratDealer {
    private ArrayList<Card> deck;
    private int sizeOfDeck;

    //
    // Creates and shuffles a deck and sets the deckSize to 52
    //
    public BaccaratDealer(){
        this.deck = new ArrayList<>();
        generateDeck();
        shuffleDeck();
    }

    //
    // Generates a standard 52 deck
    //
    public void generateDeck(){
        for(int j = 0; j < 3; j++) {
            for (int i = 1; i < 14; i++) {
                deck.add(new Card("Diamonds", i));
                deck.add(new Card("Hearts", i));
                deck.add(new Card("Spades", i));
                deck.add(new Card("Clubs", i));
            }
        }
        this.sizeOfDeck = 52;
    }

    //
    // Checks if there is at least 2 cards in the deck, it not it generates a new deck
    // Then it returns an ArrayList containing 2 cards
    //
    public ArrayList<Card> dealHand(){
        if(sizeOfDeck < 2){
            generateDeck();
            shuffleDeck();
        }

        ArrayList<Card> hand = new ArrayList<>(2);
        hand.add(drawOne());
        hand.add(drawOne());
        sizeOfDeck = sizeOfDeck - 2;
        return hand;
    }

    //
    // Draws and removes 1 card from the front of deck
    //
    public Card drawOne(){
        Card draw = deck.get(0);
        deck.remove(0);
        return draw;
    }

    //
    // Shuffles the deck using built in Collections method
    //
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    //
    // Returns the size of the deck
    //
    public int deckSize(){
        return sizeOfDeck;
    }
}
