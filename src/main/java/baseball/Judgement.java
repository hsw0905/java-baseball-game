package baseball;


import java.util.function.BiPredicate;

public enum Judgement {
  STRIKE("스트라이크"),

  BALL("볼"),
  NOTHING("낫싱");
  private String name;

  Judgement(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

}
