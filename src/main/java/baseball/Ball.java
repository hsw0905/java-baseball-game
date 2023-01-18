package baseball;

import java.util.Objects;

public class Ball {
  private final int number;

  private Ball(int number) {
    this.number = number;
  }

  public static Ball from(BallNumber number) {
    return new Ball(number.getNumber());
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
    return number == ball.number;
  }

  @Override
  public int hashCode() {
    return Objects.hash(number);
  }

}
