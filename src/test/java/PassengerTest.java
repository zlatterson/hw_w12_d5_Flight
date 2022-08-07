import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;
    @Before
    public void before(){
        passenger = new Passenger("Timmy",1);
    }
    @Test
    public void hasName(){
        assertEquals("Timmy",passenger.getName());
    }
    @Test
    public void canAddBags(){
        passenger.setNumberOfBags(2);
        assertEquals(2,passenger.getNumberOfBags());
    }

}
