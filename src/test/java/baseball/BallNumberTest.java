package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BallNumberTest {

  @DisplayName("1 ~ 9 범위의 숫자가 아니면 Exception 이 발생한다.")
  @ValueSource(ints = {0, 10})
  @ParameterizedTest
  void limitBallNumber(int number) {
    assertThatCode(() -> new BallNumber(number))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("볼은 1 ~ 9 범위의 숫자여야 합니다.");
  }

  @DisplayName("1 ~ 9 범위의 숫자면 객체가 생성된다.")
  @ValueSource(ints = {1, 9})
  @ParameterizedTest
  void createBallNumber(int number) {
    assertThatCode(()-> new BallNumber(number)).doesNotThrowAnyException();
  }

}
