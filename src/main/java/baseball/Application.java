package baseball;

import baseball.game.GameController;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        GameController controller = new GameController();
        controller.play();
    }
}
