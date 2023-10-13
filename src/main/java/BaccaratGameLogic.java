import java.util.ArrayList;

public class BaccaratGameLogic {

    public BaccaratGameLogic(){

    }

    public String whoWon(ArrayList<Card> hand1, ArrayList<Card> hand2){
        return null;
    }

    public int handTotal(ArrayList<Card> hand){
        return -1;
    }
    public boolean evaluateBankerDraw(ArrayList<Card> hand, Card playerCard){
        if(evaluatePlayerDraw(hand)){
            return true;
        }
        switch(playerCard.getValue(){
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
        return false;
    }
    public boolean evaluatePlayerDraw(ArrayList<Card> hand){
        if(handTotal(hand)) <6){
            return true;
        }
        return false;
    }
}
