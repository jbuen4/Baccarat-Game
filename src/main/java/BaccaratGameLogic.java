import java.util.ArrayList;

public class BaccaratGameLogic {

    public BaccaratGameLogic(){

    }

    public String whoWon(ArrayList<Card> hand1, ArrayList<Card> hand2){

        return null;
    }

    //
    // This method assumes the hand has only 2 cards (not sure if it can have 3
    // It adds the value of both cards and % 10 since if sum > 10, we remove the
    // first digit
    // Ex: cardOne + cardTwo = 12 -> 2 = 12 % 10
    //
    public int handTotal(ArrayList<Card> hand){

        int cardOne = hand.get(0).getValue();
        int cardTwo = hand.get(1).getValue();
        int sum = (cardTwo + cardOne) % 10;
        return sum;
    }

    public boolean evaluateBankerDraw(ArrayList<Card> hand, Card playerCard){
        int bankerSum = handTotal(hand);
        if(bankerSum <= 2){
            return true;
        }
        else if (bankerSum >= 7) {
            return false;
        }

        switch(playerCard.getValue()){
            case 1:
                if(handTotal(hand)<4){
                    return true;
                }
                return false;
            case 2:
                if(handTotal(hand)<5){
                    return true;
                }
                return false;
            case 3:
                if(handTotal(hand)<5){
                    return true;
                }
                return false;
            case 4:
                if(handTotal(hand)<6){
                    return true;
                }
                return false;
            case 5:
                if(handTotal(hand)<6){
                    return true;
                }
                return false;
            case 6:
                if(handTotal(hand)<7){
                    return true;
                }
                return false;
            case 7:
                if(handTotal(hand)<7){
                    return true;
                }
                return false;
            case 8:
                if(handTotal(hand)<3){
                    return true;
                }
                return false;
            case 9:
                if(handTotal(hand)<4){
                    return true;
                }
                return false;
            default:
                if(handTotal(hand)<4){
                    return true;
                }
                return false;
        }
    }

    public boolean evaluatePlayerDraw(ArrayList<Card> hand){
        if(handTotal(hand) < 6){
            return true;
        }
        return false;
    }
}
