import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;
    @Before
    public void before(){
        pilot = new Pilot("Timmy",RankType.CAPTAIN,"533141-FR");
    }
    @Test
    public void hasRank(){
        assertEquals(RankType.CAPTAIN, pilot.getRankType());
    }
    @Test
    public void hasLicence(){
        assertEquals("533141-FR", pilot.getLicence());
    }
    @Test
    public void canFly(){
        assertEquals("Roger, Roger", pilot.fly());
    }
}
