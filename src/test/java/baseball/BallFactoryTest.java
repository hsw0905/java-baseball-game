package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallFactoryTest {

  @DisplayName("볼은 BallNumber 와 BallPosition 을 사용해 생성한다.")
  @Test
  void createBall() {
    Ball testBall = BallFactory.from(new BallNumber(1), new BallPosition(0));

  }
}
