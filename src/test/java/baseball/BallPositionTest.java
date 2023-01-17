package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BallPositionTest {

  @DisplayName("0 ~ 2 범위의 숫자가 아니면 Exception 이 발생한다.")
  @ValueSource(ints = {-1, 3})
  @ParameterizedTest
  void limitBallPosition(int position) {
    assertThatCode(() -> new BallPosition(position))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("위치 값은 0 ~ 2 사이의 숫자만 가능합니다.");
  }

  @DisplayName("0 ~ 2 범위의 숫자면 객체가 생성된다.")
  @ValueSource(ints = {0, 2})
  @ParameterizedTest
  void createPosition(int position) {
    assertThatCode(() -> new BallPosition(position)).doesNotThrowAnyException();
  }
}
