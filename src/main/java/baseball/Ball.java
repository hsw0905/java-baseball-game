package baseball;

import java.util.Objects;

public class Ball {
  private final int number;
  private final int position;

  private Ball(int number, int position) {
    this.number = number;
    this.position = position;
  }

  public static Ball of(BallNumber number, BallPosition position) {
    return new Ball(number.getNumber(), position.getPosition());
  }

  public BallStatus play(Ball other) {
    if (isEqualNumber(other) && isEqualPosition(other)) {
      return BallStatus.STRIKE;
    }
    if (isEqualNumber(other)) {
      return BallStatus.BALL;
    }
    return BallStatus.NOTHING;
  }

  private boolean isEqualPosition(Ball other) {
    return this.position == other.position;
  }

  private boolean isEqualNumber(Ball other) {
    return this.number == other.number;
  }
}
