package racingcar;

import camp.nextstep.edu.missionutils.Randoms;

public class Car implements PlayGame{
    private String playerName;
    private int score;

    public Car(String playerName){
        this.playerName = playerName;
        score = 0;
    }

    public String getPlayerName() {
        String playerNameValue = playerName;
        return playerNameValue;
    }

    public int getScore() {
        int scoreValue = score;
        return scoreValue;
    }

    @Override
    public void playOneRound() {
        // TODO Auto-generated method stub
        checkRandomNumber(makeRandomNumber());
        throw new UnsupportedOperationException("Unimplemented method 'playOneRound'");
    }

    private int makeRandomNumber(){
        return Randoms.pickNumberInRange(0, 9);
    }

    private void checkRandomNumber(int randomNumber){
        if(randomNumber>=4){
            score++;
        }
    }
}
