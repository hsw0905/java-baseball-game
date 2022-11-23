package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JudgementTest {
  private Judgement judgement;

  @BeforeEach
  void setUp() {
    judgement = new Judgement();
  }

  @Test
  void threeStrikes() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(123);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(3);
    assertThat(judgement.getBall()).isEqualTo(0);
  }

  @Test
  void twoStrikes() {
    Ball userBall = new Ball(124);
    Ball computerBall = new Ball(123);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(2);
    assertThat(judgement.getBall()).isEqualTo(0);
  }

  @Test
  void oneStrike() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(156);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(1);
    assertThat(judgement.getBall()).isEqualTo(0);
  }

  @Test
  void threeBalls() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(312);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(0);
    assertThat(judgement.getBall()).isEqualTo(3);
  }

  @Test
  void twoBalls() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(315);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(0);
    assertThat(judgement.getBall()).isEqualTo(2);
  }

  @Test
  void oneBall() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(345);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(0);
    assertThat(judgement.getBall()).isEqualTo(1);
  }

  @Test
  void oneStrikeTwoBalls() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(132);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(1);
    assertThat(judgement.getBall()).isEqualTo(2);
  }

  @Test
  void oneStrikeOneBall() {
    Ball userBall = new Ball(123);
    Ball computerBall = new Ball(134);

    judgement.judge(userBall, computerBall);

    assertThat(judgement.getStrike()).isEqualTo(1);
    assertThat(judgement.getBall()).isEqualTo(1);
  }
}
