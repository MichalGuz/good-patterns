package flights_finder;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {

    private List<Flight> listOfConnections = new ArrayList<>();

    public FlightsRepository(List<Flight> listOfConnections) {
        this.listOfConnections = listOfConnections;
    }

    public List<Flight> getListOfConnections() {
        return listOfConnections;
    }
}
