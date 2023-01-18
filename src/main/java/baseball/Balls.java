package baseball;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Balls {

  private static final String WRONG_LIST_SIZE_MESSAGE = "반드시 3 개의 Ball 을 가져야 합니다.";
  private static final String DUPLICATED_NUMBER_MESSAGE = "각 볼끼리 숫자가 겹칠 수 없습니다.";
  private static final String DUPLICATED_POSITION_MESSAGE = "각 볼끼리 위치가 겹칠 수 없습니다.";
  private final List<Ball> balls;


  public Balls(List<Ball> balls) {
    validateSize(balls);
    validateDuplicateNumber(balls);
    validateDuplicatePosition(balls);
    this.balls = balls;
  }

  private void validateDuplicatePosition(List<Ball> balls) {
    Set<Integer> positionSet = new HashSet<>();



  }

  private void validateSize(List<Ball> balls) {
    if (balls.size() != 3) {
      throw new IllegalArgumentException(WRONG_LIST_SIZE_MESSAGE);
    }
  }

  private void validateDuplicateNumber(List<Ball> balls) {
    Set<Ball> ballSet = new HashSet<>(balls);
    if (ballSet.size() != 3) {
      throw new IllegalArgumentException(DUPLICATED_NUMBER_MESSAGE);
    }
  }


  public GameResult play(Balls userBalls) {


    return null;
  }
}
