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

    }
}
