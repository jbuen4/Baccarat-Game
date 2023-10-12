public class Card {
    private String suite;
    private int value;

    public Card(String theSuite, int theValue){
        this.suite = theSuite;
        this.value = theValue;
    }

    public String getSuite(){return this.suite;}

    public int getValue(){return this.value;}

}
