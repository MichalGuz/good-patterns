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

        public SailboatBuilder setSailboatTyoe(String sailboatTyoe) {
            this.sailboatTyoe = sailboatTyoe;
            return this;
        }

        public SailboatBuilder setBoatLenght(int boatLenght) {
            this.boatLenght = boatLenght;
            return this;
        }

        public SailboatBuilder setSailsNumber(int sailsNumber) {
            this.sailboatTyoe = sailboatTyoe;
            return this;
        }

        public SailboatBuilder setCrew(String crewMember) {
            crew.add(crewMember);
            return this;
        }

        public Sailboat build() {
            return new Sailboat(sailboatTyoe, boatLenght, sailsNumber, crew);
        }
    }

    public Sailboat(final String sailboatTyoe, final int boatLenght, final int sailsNumber, List<String> crew) {
        this.sailboatTyoe = sailboatTyoe;
        this.boatLenght = boatLenght;
        this.sailsNumber = sailsNumber;
        this.crew = new ArrayList<>(crew);
    }
}
