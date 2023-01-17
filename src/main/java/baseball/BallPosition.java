package baseball;

public class BallPosition {

  public final String WRONG_POSITION_RANGE_MESSAGE = "위치 값은 0 ~ 2 사이의 숫자만 가능합니다.";
  public final int MIN_POSITION = 0;
  public final int MAX_POSITION = 2;
  private final int position;

  public BallPosition(int position) {
    validatePosition(position);
    this.position = position;
  }

  public int getPosition() {
    return position;
  }

  private void validatePosition(int position) {
    if (position < MIN_POSITION || position > MAX_POSITION){
      throw new IllegalArgumentException(WRONG_POSITION_RANGE_MESSAGE);
    }
  }
}
