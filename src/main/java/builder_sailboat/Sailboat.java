package builder_sailboat;

import java.util.ArrayList;
import java.util.List;

public final class Sailboat {
    private final String sailboatTyoe;
    private final int boatLenght;
    private final int sailsNumber;
    private List<String> crew = new ArrayList<>();

    public static class SailboatBuilder {
        private static String sailboatTyoe;
        private static int boatLenght;
        private static int sailsNumber;
        private List<String> crew = new ArrayList<>();
    }

    public Sailboat(String sailboatTyoe, int boatLenght, int sailsNumber, List<String> crew) {
        this.sailboatTyoe = sailboatTyoe;
        this.boatLenght = boatLenght;
        this.sailsNumber = sailsNumber;
        this.crew = new ArrayList<>(crew);
    }
}
