package baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberGeneratorTest {

  @DisplayName("랜덤 3자리수를 생성한다.")
  @Test
  void createRandomNumbers() {
    Ball ball = RandomNumberGenerator.create(1, 9, 3);

    System.out.println(ball.getNum());
    System.out.println(ball.getNumList());

  }
}
