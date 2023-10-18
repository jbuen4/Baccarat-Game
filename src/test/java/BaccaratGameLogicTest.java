import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class BaccaratGameLogicTest {

    @Test
    void evaluateBankerDrawTestOne(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 1);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 0);
        assertTrue(b.evaluateBankerDraw(hand, null), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTestTwo(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
//        Card p = new Card("Suites", 7);
        assertTrue(b.evaluateBankerDraw(hand, null), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestThree(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 3);
        assertTrue(b.evaluateBankerDraw(hand, p), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestFour(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 1);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 9);
        assertTrue(b.evaluateBankerDraw(hand, p), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestFive(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 1);
        Card b2 = new Card("Suites", 4);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 4);
        assertTrue(b.evaluateBankerDraw(hand, p), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestSix(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 6);
        assertTrue(b.evaluateBankerDraw(hand, p), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestSeven(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 7);
        assertTrue(b.evaluateBankerDraw(hand, p), "evaluate banker hand is false");
    }

    @Test
    void evaluateBankerDrawTestEight(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 1);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 8);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest9(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 4);
        hand.add(b1);
        hand.add(b2);
        assertFalse(b.evaluateBankerDraw(hand, null), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest10(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 0);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest11(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 1);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest12(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 2);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest13(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 2);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 3);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest14(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 4);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest15(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 5);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest16(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 4);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 6);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest17(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 4);
        Card b2 = new Card("Suites", 3);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 7);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest18(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 1);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 8);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluateBankerDrawTest19(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 4);
        Card b2 = new Card("Suites", 0);
        hand.add(b1);
        hand.add(b2);
        Card p = new Card("Suites", 9);
        assertFalse(b.evaluateBankerDraw(hand, p), "evaluate banker hand is true");
    }

    @Test
    void evaluatePlayerDrawTestOne(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 3);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        assertTrue(b.evaluatePlayerDraw(hand), "evaluate player hand is false");
    }

    @Test
    void evaluatePlayerDrawTestTwo(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 0);
        Card b2 = new Card("Suites", 0);
        hand.add(b1);
        hand.add(b2);
        assertTrue(b.evaluatePlayerDraw(hand), "evaluate player hand is false");
    }

    @Test
    void evaluatePlayerDrawTestThree(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 4);
        Card b2 = new Card("Suites", 2);
        hand.add(b1);
        hand.add(b2);
        assertFalse(b.evaluatePlayerDraw(hand), "evaluate player hand is true");
    }

    @Test
    void evaluatePlayerDrawTestFour(){
        BaccaratGameLogic b = new BaccaratGameLogic();
        ArrayList<Card> hand = new ArrayList<>(2);
        Card b1 = new Card("Suites", 5);
        Card b2 = new Card("Suites", 4);
        hand.add(b1);
        hand.add(b2);
        assertFalse(b.evaluatePlayerDraw(hand), "evaluate player hand is true");
    }
}
