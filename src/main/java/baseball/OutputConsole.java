package baseball;

public class OutputConsole {
  public void printResult(int strikes, int balls) {
    if (strikes == 0 && balls == 0) {
      System.out.println("낫싱");
      return;
    }

    if (strikes == 0 && balls != 0) {
      System.out.printf("%d볼\n", balls);
    } else if (balls == 0 && strikes != 0) {
      System.out.printf("%d스트라이크\n",strikes);
    } else {
      System.out.printf("%d볼 %d스트라이크\n", strikes, balls);
    }
  }

  public void printWin() {
    System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
  }
}
