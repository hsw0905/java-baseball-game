package baseball;

import static org.assertj.core.api.Assertions.assertThatCode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomBallTest {

  @DisplayName("랜덤 3자리수를 생성한다.")
  @Test
  void createRandomNumbers() {
    assertThatCode(RandomBall::create).doesNotThrowAnyException();

  }
}
