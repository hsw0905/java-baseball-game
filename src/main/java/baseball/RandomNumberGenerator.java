package baseball;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
  public static Ball create(int minRangeNum, int maxRangeNum, int digitRange){
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < digitRange; i++) {
      int num = Randoms.pickNumberInRange(minRangeNum, maxRangeNum);
      builder.append(num);
    }

    return new Ball(Integer.parseInt(builder.toString()));
  }
}
