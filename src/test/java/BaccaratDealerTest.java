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
	void testDrawAndShuffle() {
		Card testCard = dealer.drawOne();
		Card testCard2 = dealer.drawOne();
		assertFalse(testCard.getValue() == 1 && testCard.getSuite() == "Diamonds" , "did not shuffle before draw");
		assertFalse(testCard2.getValue() == 1 && testCard2.getSuite() == "Hearts" , "did not shuffle defore draw");
		assertFalse(testCard.getValue() == testCard2.getValue() && testCard2.getSuite() == testCard.getSuite());
		assertEquals(dealer.deckSize(),50);
	}
	@Test
	void testDealerConstructorAndGenerateDeck() {
		assertEquals(dealer.deckSize(),52, "Constructs wrong size");
	}
	@Test
	void testDealHand() {
		ArrayList<Card> hand1 = new ArrayList<Card>(2);
		ArrayList<Card> hand2 = new ArrayList<Card>(2);
		
		hand1 = dealer.dealHand();
		hand2 = dealer.dealHand();
		
		assertEquals(hand1.size(),2);
		assertEquals(hand2.size(),2);
		assertEquals(dealer.deckSize(),48);
	}
	
}
