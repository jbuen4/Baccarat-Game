import java.util.ArrayList;

public class BaccaratGameLogic {
    private BaccaratDealer theDealer;
    public BaccaratGameLogic(BaccaratDealer theDealer){
        this.theDealer = theDealer;
    }

    public String whoWon(ArrayList<Card> dealer, ArrayList<Card> player){
        int dT = handTotal(dealer);
        int pT = handTotal(player);


        if(dT == 9 && pT != 9)
            return "Banker";
        else if(dT != 9 && pT == 9)
            return "Player";
        else if(dT == 8 && pT != 8)
            return "Banker";
        else if(dT != 8 && pT == 8)
            return "Player";

        Card pC = null;
        Card dC = null;


        if(evaluatePlayerDraw(player)) {
            pC = theDealer.drawOne();
            player.add(pC);
            pT = handTotal(player);
        }
        if(evaluateBankerDraw(dealer, pC)){
            dC = theDealer.drawOne();
            dealer.add(dC);
            dT = handTotal(dealer);
        }


        //evaluate which hand is closer to a total of 9 and return who won
        int dealerTotal = 9-dT;
        int playerTotal = 9-pT;

        for(Card e : player){
            System.out.print(e.getValue() + " ");
        }
        System.out.println();
        for(Card e : dealer){
            System.out.print(e.getValue() + " ");
        }
        System.out.println();

        System.out.println("9 - dT = " + dealerTotal);
        System.out.println("9 - pT = " + playerTotal);
        if (dealerTotal < playerTotal){
            return "Banker";
        }else if(dealerTotal > playerTotal){
            return "Player";
        }
        return "Draw";
    }

    //
    // This method works with any size hand
    // It adds the value of all the cards and % 10 since if sum > 10, we remove the
    // first digit
    // Ex: cardOne + cardTwo = 12 -> 2 = 12 % 10
    //
    public int handTotal(ArrayList<Card> hand){
        int sum = 0;
        int val;
        for(Card e : hand){
            val = e.getValue();
            if(val < 10)
                sum += val;
        }
//        System.out.println(sum%10);
        return (sum % 10);
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
    public String evaluateNaturalWin(ArrayList<Card> dealer,ArrayList<Card>player) {
    	int dT = handTotal(dealer);
        int pT = handTotal(player);


        if(dT == 9 && pT != 9)
            return "Banker";
        else if(dT != 9 && pT == 9)
            return "Player";
        else if(dT == 8 && pT != 8)
            return "Banker";
        else if(dT != 8 && pT == 8)
            return "Player";
        return null;
    }

    // returns true if the players total is less than 6, false otherwise
    public boolean evaluatePlayerDraw(ArrayList<Card> hand){
        int total = handTotal(hand);
        return total < 6;
    }
}
