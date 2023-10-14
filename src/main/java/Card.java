public class Card {
    private String suite;
    private int value;

    //
    // Creates a card with suite and value
    //
    public Card(String theSuite, int theValue){
        this.suite = theSuite;
        this.value = theValue;
    }

    //
    // Returns the suite of the card
    //
    public String getSuite(){return this.suite;}

    //
    // Returns the value of the card
    //
    public int getValue(){return this.value;}

}
