package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {
  private Ball computer;

  @BeforeEach
  void setUp() {
    computer = Ball.of(new BallNumber(1), new BallPosition(0));
  }

  @DisplayName("number, position 값이 같으면 strike 이다.")
  @Test
  void strike() {
    Ball user = Ball.of(new BallNumber(1), new BallPosition(0));
    assertThat(computer.play(user)).isEqualTo(BallStatus.STRIKE);
  }

  @DisplayName("같은 number, 다른 position 값이면 ball 이다.")
  @Test
  void ball() {
    Ball user = Ball.of(new BallNumber(1), new BallPosition(1));
    assertThat(computer.play(user)).isEqualTo(BallStatus.BALL);
  }

  @DisplayName("서로 다른 number 값이면 position 에 상관없이 nothing 이다.")
  @Test
  void nothing() {
    Ball user = Ball.of(new BallNumber(2), new BallPosition(0));
    assertThat(computer.play(user)).isEqualTo(BallStatus.NOTHING);
  }

}
