package baseball;

public class GameController {
  private final String WRONG_INPUT_EXCEPTION_MESSAGE = "잘못된 입력값입니다. 게임이 종료되었습니다.";

  private final InputConsole inputConsole;
  private final OutputConsole outputConsole;
  private final Judgement judgement;
  private final InputValidator inputValidator;
  private final RandomBall randomBall;
  private Ball userBall;
  private Ball computerBall;

  public GameController(InputConsole inputConsole, OutputConsole outputConsole, Judgement judgement,
      InputValidator inputValidator,
      RandomBall randomBall) {
    this.inputConsole = inputConsole;
    this.outputConsole = outputConsole;
    this.judgement = judgement;
    this.inputValidator = inputValidator;
    this.randomBall = randomBall;
  }

  public void run() {
    String userInputNumber = "";
    computerBall = randomBall.create();

    while (judgement.getStrike() != 3) {
      judgement.reset();
      inputConsole.printInputBall();
      userInputNumber = inputConsole.requestNumber();
      userBall = inputValidator.toBall(userInputNumber);

      judgement.judge(userBall, computerBall);
      outputConsole.printResult(judgement.getStrike(), judgement.getBall());
    }

    outputConsole.printWin();
    inputConsole.printInputRestart();

    int restartOrQuit;

    userInputNumber = inputConsole.requestNumber();
    restartOrQuit = inputValidator.validateRestartOrQuit(userInputNumber);

    if (restartOrQuit == GameRule.RESTART.getNum()) {
      judgement.reset();
      run();
    }
  }
}
