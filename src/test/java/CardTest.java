import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    void testConstructor(){
        Card diamond = new Card("Diamonds", 4);
        int val = diamond.getValue();
        String suite = diamond.getSuite();
        assertEquals(4,val,"wrong value");
        assertEquals("Diamonds", suite, "wrong suite");
    }

    @Test
    void getValueTestOne(){
        Card diamond = new Card("Spades", 1);
        int val = diamond.getValue();
        assertEquals(1,val,"wrong value");
    }
    @Test
    void getValueTestTwo(){
        Card diamond = new Card("Clubs", 8);
        int val = diamond.getValue();
        assertEquals(8,val,"wrong value");
    }

    @Test
    void getSuiteTestOne(){
        Card diamond = new Card("Spades", 1);
        String suite = diamond.getSuite();
        assertEquals("Spades", suite, "wrong suite");
    }
    @Test
    void getSuitTestTwo(){
        Card diamond = new Card("Clubs", 8);
        String suite = diamond.getSuite();
        assertEquals("Clubs", suite, "wrong suite");
    }
}
