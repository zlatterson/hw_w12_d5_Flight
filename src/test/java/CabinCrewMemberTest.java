import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {
    CabinCrewMember cabinCrewMember;
    @Before
    public void before(){
        cabinCrewMember = new CabinCrewMember("Mandy", RankType.FLIGHT_ATTENDANT);
    }
    @Test
    public void hasName(){
        assertEquals("Mandy",cabinCrewMember.getName());
    }
    @Test
    public void hasRank(){
        assertEquals(RankType.FLIGHT_ATTENDANT, cabinCrewMember.getRankType());
    }
    @Test
    public void canPromote(){
        cabinCrewMember.setRankType(RankType.FIRST_OFFICER);
        assertEquals(RankType.FIRST_OFFICER, cabinCrewMember.getRankType());
    }
    @Test
    public void canMessage(){
        String message = cabinCrewMember.announce("No smoking");
        assertEquals("No smoking", message);
    }
}
