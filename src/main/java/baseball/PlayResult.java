package baseball;

public class PlayResult {

  private int strike;
  private int ball;

  public PlayResult(int strike, int ball) {
    this.strike = strike;
    this.ball = ball;
  }

  public int getStrike() {
    return strike;
  }

  public int getBall() {
    return ball;
  }

  public String report() {
    if (strike != 0 && ball == 0) {
      return strike + Judgement.STRIKE.getName();
    } else if (strike == 0 && ball != 0) {
      return ball + Judgement.BALL.getName();
    } else if (strike != 0 && ball != 0) {
      return ball + Judgement.BALL.getName() + " " + strike + Judgement.STRIKE.getName();
    }
    return Judgement.NOTHING.getName();
  }

  public void plusStrike() {
    strike++;
  }

  public void plusBall() {
    ball++;
  }
}
