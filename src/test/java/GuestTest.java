import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest peter;
    private Guest joseph;
    private Guest ian;

    @Before
    public void before(){
       peter = new Guest("Peter");
       joseph = new Guest("Joseph");
       ian = new Guest("Ian");
    }
    @Test
    public void canGetName(){
        assertEquals("Ian", ian.getName());
    }

    @Test
    public void canSetName(){
        peter.setName("Tom");
        assertEquals("Tom", peter.getName());
    }
}

