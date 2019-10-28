package builder_checkers;

public final class FugureFactory {
    public static final String PAWN = "PAWN";
    public static final String QUEEN = "QUEEN";

    public static Figure makeFigure(String figureTyoe, String color) {
        if (figureTyoe.equals(PAWN)) {
            return new Pawn(color);
        }
    }
}
