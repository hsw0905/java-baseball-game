package baseball;

import java.util.Objects;

public class Ball {
  private final int number;

  public Ball(BallNumber number) {
    this.number = number.getNumber();
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
