package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {

  private static final String WRONG_LIST_SIZE_MESSAGE = "반드시 3 개의 Ball 을 가져야 합니다.";
  private static final String DUPLICATED_NUMBER_MESSAGE = "각 볼끼리 숫자가 겹칠 수 없습니다.";
  public static final int MAX_BALL_SIZE = 3;
  public static final String WRONG_BALLS_INDEX_RANGE_MASSAGE = "Balls index 는 0 ~ 2 사이 값이어야 합니다.";
  private final List<Ball> balls;


  public Balls(List<Ball> balls) {
    validateSize(balls);
    validateDuplicateNumber(balls);
    this.balls = balls;
  }

  private void validateSize(List<Ball> balls) {
    if (balls.size() != MAX_BALL_SIZE) {
      throw new IllegalArgumentException(WRONG_LIST_SIZE_MESSAGE);
    }
  }

  private void validateDuplicateNumber(List<Ball> balls) {
    Set<Ball> ballSet = new HashSet<>(balls);
    if (ballSet.size() != MAX_BALL_SIZE) {
      throw new IllegalArgumentException(DUPLICATED_NUMBER_MESSAGE);
    }
  }

  public Ball getBallAt(int index) {
    if (index < 0 || index > MAX_BALL_SIZE) {
      throw new IllegalArgumentException(WRONG_BALLS_INDEX_RANGE_MASSAGE);
    }
    return balls.get(index);
  }


  public Judgement play(Ball user, int position) {
    for (int i = 0; i < MAX_BALL_SIZE; i++) {
      if (user.equals(this.getBallAt(i)) && i == position) {
        return Judgement.STRIKE;
      } else if (user.equals(this.getBallAt(i)) && i != position) {
        return Judgement.BALL;
      }
    }
    return Judgement.NOTHING;
  }

  public PlayResult play(Balls user) {
    PlayResult result = new PlayResult(0, 0);

    for (int i = 0; i < MAX_BALL_SIZE; i++) {
      if (this.play(user.getBallAt(i), i) == Judgement.STRIKE) {
        result.plusStrike();
      } else if (this.play(user.getBallAt(i), i) == Judgement.BALL) {
        result.plusBall();
      }
    }
    return result;
  }
}
