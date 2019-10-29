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

    public Board getBoard() {
        return board;
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public static class CheckersBuilder {
        private static Board board = new Board();
        private static String playerOne = "";
        private static String playerTwo = "";

        public CheckersBuilder PlayerOne(String playerOne) {
            this.playerOne = playerOne;
            return this;
        }

        public CheckersBuilder PlayerTwo(String playerTwo) {
            this.playerTwo = playerOne;
            return this;
        }

        public CheckersBuilder Figure(String figureType, String figureColor, int x, int y) {
            if (x > Board.MAX_INDEX || x < Board.MIN_INDEX || y > Board.MAX_INDEX || y < Board.MIN_INDEX) {
                throw new IllegalStateException("X and Y must be in range between " + Board.MIN_INDEX + " and " + Board.MAX_INDEX);
            }
            if (board.getFigure(x, y) == null) {
                board.setFigure(FigureFactory.makeFigure(figureType, figureColor), x, y);
            } else {
                throw new IllegalStateException("Position " + x + ", " + y + " is already occupied.");
            }

        }
    }
}
