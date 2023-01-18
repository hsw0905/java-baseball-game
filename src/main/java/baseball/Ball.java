package baseball;

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

  public boolean isEqualPosition(Ball other) {
    return this.position == other.position;
  }

  public boolean isEqualNumber(Ball other) {
    return this.number == other.number;
  }
}
