import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * Created by Huzdu on 2/26/2017.
 */

/**
 * The FestivalGate class models a gate where every attendee has to validate his ticket.
 */
public class FestivalGate {
    private Queue<TicketType> ticketTypeQueue = new LinkedList<>();
    private Map<TicketType, Integer> ticketsPurchased = new HashMap<>();

    public FestivalGate(){
        for(TicketType t : TicketType.values()){
            ticketsPurchased.put(t,0);
        }
    }

    public void addTicket(TicketType ticket){
        ticketTypeQueue.add(ticket);
        int ticketsType = ticketsPurchased.get(ticket);
        ticketsPurchased.put(ticket, ticketsType +1);
    }

    public Map<TicketType, Integer> getTicketsPurchased(){
        return ticketsPurchased;
    }
}