import java.util.ArrayList;

public class BaccaratGameLogic {

    public BaccaratGameLogic(){

    }

    public String whoWon(ArrayList<Card> dealer, ArrayList<Card> player){
        //evaluate which hand is closer to a total of 9 and return who won
        int dealerTotal = handTotal(dealer)-9;
        int playerTotal = handTotal(player)-9;
        if(dealerTotal < 0){
            dealerTotal*=-1;
        }
        if(playerTotal < 0){
            playerTotal*=-1;
        }
        if (dealerTotal < playerTotal){
            return "Dealer won";
        }else if(dealerTotal > playerTotal){
            return "Player won";
        }
        return "Draw";
    }

    //
    // This method assumes the hand has only 2 cards (not sure if it can have 3
    // It adds the value of both cards and % 10 since if sum > 10, we remove the
    // first digit
    // Ex: cardOne + cardTwo = 12 -> 2 = 12 % 10
    //
    public int handTotal(ArrayList<Card> hand){

        int cardOne = hand.get(0).getValue();
        if(cardOne > 9)
            cardOne = 0;

        int cardTwo = hand.get(1).getValue();
        if(cardTwo > 9)
            cardTwo = 0;

        int sum = (cardTwo + cardOne) % 10;
        return sum;
    }

    //
    // Returns true if the banker draws an extra cards based on certain situations
    //
    public boolean evaluateBankerDraw(ArrayList<Card> hand, Card playerCard){
        /*Get the total of the dealers hand if the total is 2 or less return true. If it is 7 or more return false*/
        int bankerSum = handTotal(hand);
        if(bankerSum <= 2){
            return true;
        }
        else if (bankerSum >= 7) {
            return false;
        }
        //If player did not draw a card if the total is less than 6 return true otherwise return false
        if(playerCard == null){
            if(bankerSum<6){
                return true;
            }
            return false;
        }
        //Get the value of the players third card and use it to determine whether the dealer draws or not
        switch(playerCard.getValue()){
            case 1:
                if(bankerSum<4){
                    return true;
                }
                return false;
            case 2:
                if(bankerSum<5){
                    return true;
                }
                return false;
            case 3:
                if(bankerSum<5){
                    return true;
                }
                return false;
            case 4:
                if(bankerSum<6){
                    return true;
                }
                return false;
            case 5:
                if(bankerSum<6){
                    return true;
                }
                return false;
            case 6:
                if(bankerSum<7){
                    return true;
                }
                return false;
            case 7:
                if(bankerSum<7){
                    return true;
                }
                return false;
            case 8:
                if(bankerSum<3){
                    return true;
                }
                return false;
            case 9:
                if(bankerSum<4){
                    return true;
                }
                return false;
            default:
                if(bankerSum<4){
                    return true;
                }
                return false;
        }
    }

    // returns true if the players total is less than 6, false otherwise
    public boolean evaluatePlayerDraw(ArrayList<Card> hand){
        int total = handTotal(hand);
        return total < 6;
    }
}
