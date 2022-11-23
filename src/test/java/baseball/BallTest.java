package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class BallTest {

  @DisplayName("3자리수 숫자가 아니면 예외가 발생한다.")
  @ParameterizedTest
  @ValueSource(ints = {12, 1234})
  void createFail(int value) {
    assertThatCode(() -> new Ball(value))
        .isInstanceOf(IllegalArgumentException.class)
        .hasMessage("잘못된 입력값입니다. 3자리 숫자를 입력해주세요.");
  }
}
