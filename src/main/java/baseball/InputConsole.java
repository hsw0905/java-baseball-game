package baseball;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputConsole {
  public String requestNumber() {
    String userInput = "";
    userInput = readLine();

    return userInput;
  }

  public void printInputBall() {
    System.out.print("숫자를 입력해주세요 : ");
  }

  public void printInputRestart() {
    System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
  }

}
