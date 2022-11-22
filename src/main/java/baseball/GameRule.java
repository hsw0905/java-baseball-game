package baseball;

public enum GameRule {
  DIGIT_RANGE(3),
  MIN_LIMIT_NUMBER(111),
  MAX_LIMIT_NUMBER(999),
  MIN_RANGE_NUMBER(1),
  MAX_RANGE_NUMBER(9);

  private final int num;

  GameRule(int num) {
    this.num = num;
  }

  public int getNum() {
    return num;
  }
}
