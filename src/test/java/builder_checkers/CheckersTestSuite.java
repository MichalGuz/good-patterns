package builder_checkers;

import org.junit.Test;

public class CheckersTestSuite {
    @Test
    public void testCheckersBuilder() {
        // given
        Checkers checkers = new Checkers.CheckersBuilder()
                .PlayerOne("Kasparov")
                .PlayerTwo("Anand")
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 3)
                .Figure(FigureFactory.PAWN, Figure.WHITE, 0, 7)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 3)
                .Figure(FigureFactory.PAWN, Figure.BLACK, 9, 7)

    }
}
