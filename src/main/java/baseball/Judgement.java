package baseball;


import java.util.function.BiPredicate;

public enum Judgement {
  STRIKE("스트라이크",
      (computer, user) -> computer.isEqualNumber(user) && computer.isEqualPosition(user)),

  BALL("볼", (computer, user) -> computer.isEqualNumber(user) && !computer.isEqualPosition(user)),
  NOTHING("낫싱",
      (computer, user) -> !computer.isEqualNumber(user));
  private String name;
  private BiPredicate<Ball, Ball> judgement;

  Judgement(String name, BiPredicate<Ball, Ball> judgement) {
    this.name = name;
    this.judgement = judgement;
  }

  public String getName() {
    return name;
  }

  public Boolean result(Ball computer, Ball user) {
    return judgement.test(computer, user);
  }
}
