package baseball;

public class BallFactory {

  private BallFactory() {
  }

  public static Ball from(BallNumber number, BallPosition position) {
    return new Ball(number.getNumber(), position.getPosition());
  }
}
