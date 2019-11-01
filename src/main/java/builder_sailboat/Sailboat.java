package builder_sailboat;

import java.util.ArrayList;
import java.util.List;

public final class Sailboat {
    private final String sailboatType;
    private final int boatLength;
    private final int sailsNumber;
    private final String boatName;
    private List<String> crew;

    public static class SailboatBuilder {
        private static String sailboatType;
        private static int boatLength;
        private static int sailsNumber;
        private static String boatName;
        private List<String> crew = new ArrayList<>();

        public SailboatBuilder setSailboatType(String sailboatType) {
            this.sailboatType = sailboatType;
            return this;
        }

        public SailboatBuilder setBoatLength(int boatLength) {
            this.boatLength = boatLength;
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
            return new Sailboat(sailboatType, boatLength, sailsNumber, boatName, crew);
        }
    }

    private Sailboat(final String sailboatType, final int boatLength, final int sailsNumber, final String boatName, List<String> crew) {
        this.sailboatType = sailboatType;
        this.boatLength = boatLength;
        this.sailsNumber = sailsNumber;
        this.boatName = boatName;
        this.crew = new ArrayList<>(crew);
    }

    public String getSailboatType() {
        return sailboatType;
    }

    public int getBoatLength() {
        return boatLength;
    }

    public int getSailsNumber() {
        return sailsNumber;
    }

    public String getBoatName() {
        return boatName;
    }

    public List<String> getCrew() {
        return crew;
    }

    @Override
    public String toString() {
        return "Sailboat{" +
                "sailboatTyoe='" + sailboatType + '\'' +
                ", boatLength=" + boatLength +
                ", sailsNumber=" + sailsNumber +
                ", boatName=" + boatName +
                ", crew=" + crew +
                '}';
    }
}
