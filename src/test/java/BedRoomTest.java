import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    private BedRoom bedroomdouble;
    private BedRoom bedroomsingle;
    private Guest ian;
    private Guest joseph;
    private Guest peter;

    @Before
    public void before(){
        bedroomdouble = new BedRoom(1, 2, "Double");
        bedroomsingle = new BedRoom(2,1,"single");
        ian = new Guest("Ian");
        joseph = new Guest("Joseph");
        peter = new Guest("Peter");
    }

    @Test
    public void checkTenantsInRoom(){
        bedroomdouble.addGuest(ian);
        assertEquals(1, bedroomdouble.tenantsCount());
    }
    @Test
    public void checkNoTenantsInRoom(){
        assertEquals(0, bedroomdouble.tenantsCount());
    }
    @Test
    public void kickIanOut(){
        bedroomdouble.addGuest(ian);
        bedroomdouble.addGuest(joseph);
        bedroomdouble.checkoutGuest(ian);
        assertEquals(false, bedroomdouble.guestPresent(ian));
    }


}
