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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ball ball = (Ball) o;
    return number == ball.number && position == ball.position;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, position);
  }

  public boolean isEqualPosition(Ball other) {
    return this.position == other.position;
  }

  public boolean isEqualNumber(Ball other) {
    return this.number == other.number;
  }
}
