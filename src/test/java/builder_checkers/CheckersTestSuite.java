package builder_checkers;

import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        // given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("Kasparov")
                .PlayerTwo("Anand")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 1, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 8, 3)
                .Figure(FigureFactory.QUEEN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.QUEEN, Figure.BLACK, 9, 5)
                .build();
        System.out.println(checkers.getBoard());

        // when
        Figure figureOne = checkers.getBoard().getFigure(1,3);
        Figure figureTwo = checkers.getBoard().getFigure(8,3);
        Figure figureThree = checkers.getBoard().getFigure(0,3);
        Figure figureFour = checkers.getBoard().getFigure(9,5);
    }
}
