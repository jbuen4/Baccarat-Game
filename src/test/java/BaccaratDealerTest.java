import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaccaratDealerTest {
	public BaccaratDealer dealer;
	@BeforeEach
    void setUp() {
        dealer = new BaccaratDealer(); 
    }
	@Test
	void testDraw() {
		Card testCard = dealer.drawOne();
		Card testCard2 = dealer.drawOne();
		assertFalse(testCard.getValue() == testCard2.getValue() && testCard2.getSuite() == testCard.getSuite(),"Did not remove card");
		assertEquals(dealer.deckSize(),50,"Did not update size");
	}
	@Test
	void testDealerConstructorAndGenerateDeck() {
		assertEquals(dealer.deckSize(),52, "Constructs wrong size");
	}
	@Test
	void testDealHand() {
		ArrayList<Card> hand1;
		ArrayList<Card> hand2;
		
		hand1 = dealer.dealHand();
		hand2 = dealer.dealHand();
		
		assertEquals(hand1.size(),2);
		assertEquals(hand2.size(),2);
		assertEquals(dealer.deckSize(),48);
	}

    @Test
    void shuffleTestOne(){
        BaccaratDealer d = new BaccaratDealer();
        ArrayList<Card> orig = d.getDeck();
        d.shuffleDeck();
        assertFalse(orig!=d.getDeck(), "deck not shuffled");
    }

    @Test
    void shuffleTestTwo(){
        BaccaratDealer d = new BaccaratDealer();
        d.shuffleDeck();
        ArrayList<Card> orig = d.getDeck();
        d.shuffleDeck();
        assertFalse(orig!=d.getDeck(), "deck not shuffled");
    }
	
}
