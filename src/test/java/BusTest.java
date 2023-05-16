import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person jemima;

    @Before
    public void setUp() {
        bus = new Bus("Silverknowes", 2);
        jemima = new Person();
    }

    @Test
    public void hasPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void canWeAddPassengers(){
        bus.addPassenger(jemima);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void cannotAddPassenger(){
        bus.addPassenger(jemima);
        bus.addPassenger(jemima);
        bus.addPassenger(jemima);
        assertEquals(2, bus.passengerCount());
    }

    @Test
    public void removePassenger(){
        bus.addPassenger(jemima);
        bus.bootPassenger(jemima);
        assertEquals(0, bus.passengerCount());
    }


}
