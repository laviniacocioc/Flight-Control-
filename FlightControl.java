package FlightControl.logic;
import java.util.Collection;
import FlightControl.domain.Flight;
import FlightControl.domain.Airplane;
import java.util.HashMap;
import java.util.Map;
import FlightControl.domain.Place;
/**
 *
 * @author Lavinia
 */
public class FlightControl {
    private HashMap<String, Airplane> airplanes = new HashMap<>();
    private HashMap<String, Flight> flights = new HashMap<>();
    private Map<String, Place> places;

    public FlightControl() {
        this.flights = new HashMap<>();
        this.airplanes = new HashMap<>();
        this.places = new HashMap<>();
    }

    public void addAirplane(String ID, int capacity) {
        Airplane plane = new Airplane(ID, capacity);
        this.airplanes.put(ID, plane);
    }

    public void addFlight(Airplane plane, String departureID, String arrivalID) {
        this.places.putIfAbsent(departureID, new Place(departureID));
        this.places.putIfAbsent(arrivalID, new Place(arrivalID));

        Flight flight = new Flight(plane, this.places.get(departureID), this.places.get(arrivalID));
        this.flights.put(flight.toString(), flight);
    }

    public Collection<Airplane> getAirplanes() {
        return this.airplanes.values();
    }

    public Collection<Flight> getFlights() {
        return this.flights.values();
    }

    public Airplane getAirplane(String ID) {
        return this.airplanes.get(ID);
    }
}

