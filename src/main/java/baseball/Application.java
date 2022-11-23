package baseball;

import java.io.IOException;

public class Application {

  public static void main(String[] args){
    //TODO: 숫자 야구 게임 구현
    GameController controller = new GameController(
        new InputConsole(), new OutputConsole(), new Judgement(), new InputValidator(),
        new RandomBall()
    );

      controller.run();
  }
}
