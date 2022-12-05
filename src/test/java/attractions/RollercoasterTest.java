package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice() {
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0);
    }

    @Test
    public void hasPriceForTallPeople() {
        Visitor visitor1 = new Visitor(16, 201, 15);
        assertEquals(16.80, rollerCoaster.priceFor(visitor1), 0);
    }

    @Test
    public void isAllowedTo_False(){
        Visitor visitor1 = new Visitor(13, 110, 10);
        assertEquals(false, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isAllowedTo_True(){
        Visitor visitor1 = new Visitor(13, 160, 10);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }
}
