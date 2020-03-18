import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    private ConferenceRoom claymore;
    private ConferenceRoom mcgreggor;
    private Guest ian;
    private Guest joseph;
    private Guest peter;

    @Before
    public void before() {
        claymore = new ConferenceRoom("Claymore", 2);
        mcgreggor = new ConferenceRoom("McGreggor", 1);
        ian = new Guest("Ian");
        joseph = new Guest("Joseph");
        peter = new Guest("Peter");
    }


    @Test
    public void addGuest(){
        claymore.addGuest(joseph);
        assertEquals(1, claymore.tenantsCount());
    }
    @Test
    public void fullRoom(){
        claymore.addGuest(joseph);
        claymore.addGuest(ian);
        claymore.addGuest(peter);
        claymore.addGuest(joseph);
        assertEquals(2, claymore.tenantsCount());
    }

}

