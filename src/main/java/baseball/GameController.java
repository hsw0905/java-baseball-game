package baseball;

public class GameController {

  private final InputConsole inputConsole;
  private final OutputConsole outputConsole;
  private final Judgement judgement;
  private final InputValidator inputValidator;
  private final RandomBall randomBall;

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
    Ball computerBall = randomBall.create();

    while (judgement.getStrike() != GameRule.DIGIT_RANGE.getNum()) {
      judgement.reset();
      inputConsole.printInputBall();
      userInputNumber = inputConsole.requestNumber();
      Ball userBall = inputValidator.toBall(userInputNumber);

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
