import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Huzdu on 2/27/2017.
 */
public class FestivalGateTest {
    @Test
    public void gateCorrectlyIncrementsTicketsValidated(){
        FestivalGate gate = new FestivalGate();
        gate.addTicket(TicketType.FREE_PASS);
        int ticketsOfKind = gate.getTicketsPurchased().get(TicketType.FREE_PASS);
        Assert.assertEquals(ticketsOfKind, 1);
    }

}