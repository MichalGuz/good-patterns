package flights_finder;

import java.util.ArrayList;
import java.util.List;

public class FlightsRepository {

    private List<Flight> listOfConnections = new ArrayList<>();

    List<Flight> addFlight(Flight flight) {
        listOfConnections.add(flight);
        return listOfConnections;
    }


//    public FlightsRepository(List<Flight> listOfConnections) {
//        this.listOfConnections = listOfConnections;
//    }

    public List<Flight> getListOfConnections() {
        return listOfConnections;
    }

    @Override
    public String toString() {
        String connection = " x";
//        String connection = listOfConnections.stream()
//                .map(Flight::getArrival)
//                .toString();
        for (int i = 0; i < listOfConnections.size(); i++) {
            connection = "FlightsRepository{" +
                    "listOfConnections=" + listOfConnections.get(i).getDeparture() + " - " + listOfConnections.get(i).getArrival() +
                    '}';
        }
        return connection;
    }
}
