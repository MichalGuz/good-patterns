package builder_sailboat;

import java.util.ArrayList;
import java.util.List;

public final class Sailboat {
    private final String sailboatTyoe;
    private final int boatLenght;
    private final int sailsNumber;
    private final String boatName;
    private List<String> crew = new ArrayList<>();

    public static class SailboatBuilder {
        private static String sailboatTyoe;
        private static int boatLenght;
        private static int sailsNumber;
        private static String boatName;
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
            this.sailsNumber = sailsNumber;
            return this;
        }

        public SailboatBuilder setBoatName(String boatName) {
            this.boatName = boatName;
            return this;
        }

        public SailboatBuilder setCrewMember(String crewMember) {
            crew.add(crewMember);
            return this;
        }

        public Sailboat build() {
            return new Sailboat(sailboatTyoe, boatLenght, sailsNumber, boatName, crew);
        }
    }

    private Sailboat(final String sailboatTyoe, final int boatLenght, final int sailsNumber, final String boatName, List<String> crew) {
        this.sailboatTyoe = sailboatTyoe;
        this.boatLenght = boatLenght;
        this.sailsNumber = sailsNumber;
        this.boatName = boatName;
        this.crew = new ArrayList<>(crew);
    }

    public String getSailboatTyoe() {
        return sailboatTyoe;
    }

    public int getBoatLenght() {
        return boatLenght;
    }

    public int getSailsNumber() {
        return sailsNumber;
    }

    public List<String> getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "Sailboat{" +
                "sailboatTyoe='" + sailboatTyoe + '\'' +
                ", boatLenght=" + boatLenght +
                ", sailsNumber=" + sailsNumber +
                ", crew=" + crew +
                '}';
    }
}
