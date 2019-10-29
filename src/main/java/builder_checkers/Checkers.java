package builder_checkers;

public class Checkers {
    private final Board board;
    private final String playerOne;
    private final String playerTwo;

    public Checkers(Board board, String playerOne, String playerTwo) {
        this.board = board;
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }
}
