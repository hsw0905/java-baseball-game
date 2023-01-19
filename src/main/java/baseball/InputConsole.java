package baseball;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputConsole {

  public static String readString() {
    String input;
    try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
      input = br.readLine();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return input;
  }

  public static void printInputBall() {
    System.out.print("숫자를 입력해주세요 : ");
  }

  public static void printInputRestart() {
    System.out.print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
  }
}
