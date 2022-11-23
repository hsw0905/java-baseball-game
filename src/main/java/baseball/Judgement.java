package baseball;

import java.util.List;

public class Judgement {
  private int strike = 0;
  private int ball = 0;

  public int getStrike() {
    return strike;
  }

  public int getBall() {
    return ball;
  }

  public void reset() {
    strike = 0;
    ball = 0;
  }

  public void judge(Ball userBall, Ball computerBall) {
    List<Integer> userNumList = userBall.getNumList();
    List<Integer> computerNumList = computerBall.getNumList();

    for (int i = 0; i < GameRule.DIGIT_RANGE.getNum(); i++) {
      if (isStrike(userNumList.get(i), computerNumList.get(i))){
        strike++;
      }

      if (isBall(userNumList.get(i), i, computerNumList)){
        ball++;
      }
    }
  }
  private boolean isStrike(Integer userNum, Integer computerNum) {
    return userNum.equals(computerNum);
  }

  private boolean isBall(Integer userNum, int userIndex, List<Integer> computerNumList){
    for (int i = 0; i < GameRule.DIGIT_RANGE.getNum(); i++) {
      if (i != userIndex && userNum.equals(computerNumList.get(i))) {
        return true;
      }
    }
    return false;
  }
}
