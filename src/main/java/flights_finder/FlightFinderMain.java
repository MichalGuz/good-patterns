package flights_finder;

public class FlightFinderMain {
    public static void main(String[] args) {
        FlightsRepository flightsRepository = new FlightsRepository();
        flightsRepository.addFlight(new Flight("Warsaw", "Berlin"));

        System.out.println(flightsRepository.getListOfConnections().toString());

    }
}
