package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayResultTest {

  private Balls computer;

  @BeforeEach
  void setUp() {
    computer = new Balls(Arrays.asList(
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(2)),
        new Ball(new BallNumber(3))
    ));

  }

  @DisplayName("각 볼의 위치와 숫자가 하나 같으면 1스트라이크이다")
  @Test
  void play1Strike() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(4)),
        new Ball(new BallNumber(5))
    ));
    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("1스트라이크");
    assertThat(result.getStrike()).isEqualTo(1);
    assertThat(result.getBall()).isEqualTo(0);
  }

  @DisplayName("각 볼의 숫자 1개가 같지만 위치가 다를 경우 1볼이다.")
  @Test
  void play1Ball() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(4)),
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(5))
    ));
    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("1볼");
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(1);
  }

  @DisplayName("각 볼의 숫자와 하나도 같지 않으면 낫싱이다.")
  @Test
  void playNothing() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(4)),
        new Ball(new BallNumber(5)),
        new Ball(new BallNumber(6))
    ));
    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("낫싱");
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(0);
  }

  @DisplayName("스트라이크가 2개이면 2스트라이크이다.")
  @Test
  void play2Strike() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(2)),
        new Ball(new BallNumber(4))
    ));

    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("2스트라이크");
    assertThat(result.getStrike()).isEqualTo(2);
    assertThat(result.getBall()).isEqualTo(0);
  }

  @DisplayName("볼이 2개이면 2볼이다.")
  @Test
  void play2Ball() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(2)),
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(4))
    ));

    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("2볼");
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(2);
  }

  @DisplayName("볼이 3개이면 3볼이다.")
  @Test
  void play3Ball() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(3)),
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(2))
    ));

    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("3볼");
    assertThat(result.getStrike()).isEqualTo(0);
    assertThat(result.getBall()).isEqualTo(3);
  }

  @DisplayName("볼 2개 + 1 스트라이크")
  @Test
  void play2ball1Strike() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(2)),
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(3))
    ));

    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("2볼 1스트라이크");
    assertThat(result.getStrike()).isEqualTo(1);
    assertThat(result.getBall()).isEqualTo(2);
  }

  @DisplayName("3 스트라이크")
  @Test
  void play3Strike() {
    Balls user = new Balls(Arrays.asList(
        new Ball(new BallNumber(1)),
        new Ball(new BallNumber(2)),
        new Ball(new BallNumber(3))
    ));

    PlayResult result = computer.play(user);

    assertThat(result.report()).isEqualTo("3스트라이크");
    assertThat(result.getStrike()).isEqualTo(3);
    assertThat(result.getBall()).isEqualTo(0);
  }
}
