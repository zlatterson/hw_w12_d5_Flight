import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Plane plane;
    Passenger passenger;
    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane,"FR102","EDI","LIS","14:24");
    }
    @Test
    public void canGetRemainingSeats(){
        assertEquals(162,flight.getNumberOfRemainingSeats());
    }
    @Test
    public void canCheckIn(){
        passenger = new Passenger("Charles",3);
        flight.checkIn(passenger);
        assertEquals(1,flight.getPassengersNumber());
    }
}
