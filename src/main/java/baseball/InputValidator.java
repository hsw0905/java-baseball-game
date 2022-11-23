package baseball;

public class InputValidator {
  public Integer validateRestartOrQuit(String userInput) {
    int toInt = Integer.parseInt(userInput);

    if (GameRule.RESTART.getNum() != toInt && GameRule.EXIT.getNum() != toInt){
      throw new IllegalArgumentException("잘못된 입력값입니다. 1: 재시작, 2: 종료 중 하나를 입력해주세요.");
    }
    return toInt;
  }

  public Ball toBall(String userInput) {
    int toInt = Integer.parseInt(userInput);
    return new Ball(toInt);
  }
}
