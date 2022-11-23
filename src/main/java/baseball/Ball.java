package baseball;

import java.util.ArrayList;
import java.util.List;

public class Ball {

  private final String WRONG_INPUT_VALUE_MESSAGE = "Wrong Input value";
  private final int num;
  private List<Integer> numList;

  public Ball(final int num) {
    validate(num);
    this.num = num;

  }

  public void validate(int num) {
    if (num < GameRule.MIN_LIMIT_NUMBER.getNum() || num > GameRule.MAX_LIMIT_NUMBER.getNum()) {
      throw new IllegalArgumentException(WRONG_INPUT_VALUE_MESSAGE);
    }

    numList = new ArrayList<>();
    int reversed = getReversed(num);

    for (int i = 0; i < 3; i++) {
      int last = reversed % 10;
      reversed /= 10;
      this.numList.add(last);
    }

  }

  public int getNum() {
    return num;
  }

  public List<Integer> getNumList() {
    return this.numList;
  }

  private int getReversed(int num) {
    int temp = num;
    int reversed = 0;

    while (temp > 0) {
      int last = temp % 10;
      temp /= 10;
      reversed = reversed * 10 + last;
    }

    return reversed;
  }
}
