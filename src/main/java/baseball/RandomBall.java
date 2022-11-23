package baseball;

import static baseball.GameRule.*;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomBall implements RandomBallGenerator{
  @Override
  public Ball create(){
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < DIGIT_RANGE.getNum(); i++) {
      int num = Randoms.pickNumberInRange(MIN_RANGE_NUMBER.getNum(), MAX_RANGE_NUMBER.getNum());
      builder.append(num);
    }

    return new Ball(Integer.parseInt(builder.toString()));
  }
}
