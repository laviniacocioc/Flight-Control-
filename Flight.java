package FlightControl.domain;

/**
 *
 * @author Lavinia
 */
public class Flight {
    private Airplane airplane;
    private Place departureAirport;
    private Place arrivalAirport;
    
    public Flight(Airplane airplane, Place departureAirport, Place arrivalAirport) {
        this.airplane = airplane;
        this.arrivalAirport = arrivalAirport;
        this.departureAirport = departureAirport;
    }
    
     public Airplane getAirplane() {
        return this.airplane;
    }

    public Place getDeparturePlace() {
        return this.departureAirport;
    }

    public Place getTargetPlace() {
        return this.arrivalAirport;
    }

    @Override
    public String toString() {
        return this.airplane.toString() + " (" + this.departureAirport + "-" + this.arrivalAirport + ")";
    }
}
