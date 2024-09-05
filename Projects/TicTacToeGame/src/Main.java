package Projects.TicTacToeGame.src;
import Projects.TicTacToeGame.src.TicTacToeGameClass;
public class Main {
    public static void main(String args[]) {
        TicTacToeGameClass game = new TicTacToeGameClass();
        game.initializeGame();
        System.out.println("Winner of the game is : " + game.startGame());
    }
}

