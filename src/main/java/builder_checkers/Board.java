package builder_checkers;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;

public class Board {
    public final static int MIN_INDEX = 0;
    public final static int MAX_INDEX = 9;

    Figure[][] board = new Figure[10][];

    public Board() {
        for (int i = 0; i < 10; i++) {
            board[i] = new Figure[10];
        }
    }

    public Figure getFigure(int x, int y) {
        return board[x][y];
    }

    public void setFigure(Figure figure, int x, int y) {
        board[x][y] = figure;
    }

    public String toString() {
        String result = "";
        for (int n = MIN_INDEX; n <= MAX_INDEX; n++) {
            result += " ";
            for (int r = MIN_INDEX; r <=  MAX_INDEX; r++) {
                if (board[n][r] == null) {
                    result += " ";
                } else {
                    result += (board[n][r]).getColor().equals(Figure.BLACK) ? "b" : "w";
                    result += (board[n][r]) instanceof Pawn ? "P" : "Q";
                }
                result += "|";
            }
            result += "\n";
]