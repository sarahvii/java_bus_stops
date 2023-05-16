import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person jemima;
    Bus bus;

    @Before
    public void setUp(){
        busStop = new BusStop("Oxgangs");
        bus = new Bus("Silverknowes", 2);
        jemima = new Person();
    }

    @Test
    public void canAddToQueue(){
        busStop.addPerson(jemima);
        assertEquals (1, busStop.getQueueSize());
    }

    @Test
    public void canRemoveFolk(){
        busStop.addPerson(jemima);
        busStop.bootJemima(jemima);
        assertEquals(0, busStop.getQueueSize());
    }


}
