import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Guest ian;
    private Guest joseph;
    private Guest peter;

    private ConferenceRoom claymore;
    private ConferenceRoom mcgreggor;

    private BedRoom bedroomdouble;
    private BedRoom bedroomsingle;

    private Hotel codeclan;
    private Hotel conference1;

    @Before
    public void before(){



        bedroomdouble = new BedRoom(1, 2, "Double");
        bedroomsingle = new BedRoom(2,1,"single");

        claymore = new ConferenceRoom("Claymore", 2);
        mcgreggor = new ConferenceRoom("McGreggor", 1);

        ian = new Guest("Ian");
        joseph = new Guest("Joseph");
        peter = new Guest("Peter");

        codeclan = new Hotel();

    }

    @Test
    public void addBedRoom(){
        codeclan.addBedRoom(bedroomdouble);
        codeclan.addBedRoom(bedroomsingle);
        assertEquals(2,codeclan.amountOfBedRooms());
    }
    @Test
    public void addConferenceRoom(){
        codeclan.addConferenceRoom(claymore);
        codeclan.addConferenceRoom(mcgreggor);
        assertEquals(2, codeclan.amountOfConferenceRooms());
    }
    @Test
    public void addGuestToRoom(){
        codeclan.addBedRoom(bedroomdouble);
        codeclan.addBedRoom(bedroomsingle);
        codeclan.checkIn(2, ian);
        assertEquals(1, bedroomsingle.tenantsCount());
    }
    @Test
    public void removeGuestToRoom(){
        codeclan.addBedRoom(bedroomdouble);
        codeclan.addBedRoom(bedroomsingle);
        codeclan.checkIn(2, ian);
        codeclan.checkOut(2, ian);
        assertEquals(0, bedroomsingle.tenantsCount());
    }

    @Test
    public void addGuestToConferenceRoom(){
        codeclan.addConferenceRoom(claymore);
        codeclan.addConferenceRoom(mcgreggor);
        codeclan.checkIn("Claymore", ian);
        assertEquals(1, claymore.tenantsCount());
    }
    @Test
    public void removeGuestToConferenceRoom(){
        codeclan.addConferenceRoom(claymore);
        codeclan.addConferenceRoom(mcgreggor);
        codeclan.checkIn("Claymore", ian);
        codeclan.checkOut("Claymore", ian);
        assertEquals(0, claymore.tenantsCount());
    }

}
