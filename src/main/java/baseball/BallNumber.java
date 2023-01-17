package baseball;

public class BallNumber {

  private final int MIN_NUMBER = 1;
  public final int MAX_NUMBER = 9;
  private final String WRONG_NUMBER_RANGE_MESSAGE = "볼은 1 ~ 9 범위의 숫자여야 합니다.";
  private final int number;


  public BallNumber(int number) {
    validateNumber(number);
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  private void validateNumber(int number) {
    if (number < MIN_NUMBER || number > MAX_NUMBER){
      throw new IllegalArgumentException(WRONG_NUMBER_RANGE_MESSAGE);
    }
  }
}
