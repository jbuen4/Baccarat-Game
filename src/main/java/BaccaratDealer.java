import java.util.ArrayList;

public class BaccaratDealer {
    private ArrayList<Card> deck;

    public void generateDeck(){
        for(int i=1; i<14; i++){
            deck.add(new Card(i,"Diamonds");
            deck.add(new Card(i,"Hearts");
            deck.add(new Card(i,"Spades");
            deck.add(new Card(i,"Clubs");
        }
    }

    public BaccaratDealer(){
        generateDeck();
        shuffleDeck();
    }

    public ArrayList<Card> dealHand(){
        ArrayList<Card> hand = new ArrayList<Card>(2);
        hand.add(drawOne());
        hand.add(drawOne());
        return hand;
    }

    public Card drawOne(){
        Card draw = deck.get(0);
        deck.remove(0);
        return draw;
    }

    public void shuffleDeck(){

    }

    public int deckSize(){
        return deck.size();
    }
}
