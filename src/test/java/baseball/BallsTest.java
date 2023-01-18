package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;

import java.util.Arrays;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallsTest {

  @DisplayName("반드시 3 개의 Ball 을 가져야 한다.")
  @Test
  void mustContainThreeBall() {
    assertThatCode(() -> new Balls(
        Arrays.asList(
            Ball.of(new BallNumber(1), new BallPosition(0)),
            Ball.of(new BallNumber(2), new BallPosition(1)),
            Ball.of(new BallNumber(3), new BallPosition(2))
        ))).doesNotThrowAnyException();
  }

  @DisplayName("3 개의 Ball 이 아니면 Exception 이 발생한다.")
  @Test
  void mustContainThreeBall2() {
    assertThatCode(() -> new Balls(
        Arrays.asList(
            Ball.of(new BallNumber(1), new BallPosition(0)),
            Ball.of(new BallNumber(2), new BallPosition(1))
        ))).isInstanceOf(IllegalArgumentException.class)
        .hasMessage("반드시 3 개의 Ball 을 가져야 합니다.");
  }

  @DisplayName("각 볼끼리 숫자와 위치가 겹칠 수 없다.")
  @Test
  void mustNotDuplicateBall() {
    assertThatCode(() -> new Balls(
        Arrays.asList(
            Ball.of(new BallNumber(1), new BallPosition(0)),
            Ball.of(new BallNumber(2), new BallPosition(1)),
            Ball.of(new BallNumber(2), new BallPosition(1))
        ))).isInstanceOf(IllegalArgumentException.class)
        .hasMessage("각 볼끼리 숫자와 위치가 겹칠 수 없습니다.");
  }

}
