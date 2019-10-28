package builder_checkers;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;

    Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i < 10; i++) {
            board[i] = new Figure[10];
        }
    }
}
