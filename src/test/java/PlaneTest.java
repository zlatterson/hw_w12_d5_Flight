import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }
    @Test
    public void hasType(){
        assertEquals(PlaneType.BOEING747,plane.getPlaneType());
    }
    @Test
    public void hasWeight(){
        assertEquals(41410, plane.planeType.getWeight());
    }
    @Test
    public void hasCapacity(){
        assertEquals(162,plane.planeType.getCapacity());
    }
}
