import java.util.Map;

/**
 * Created by Huzdu on 2/26/2017.
 */

/**
 * The FestivalStatisticsThread extends the Thread class and simulates
 * a statistics generator, which is woken up every 5 seconds and prints the information about TicketType and gate.
 */
public class FestivalStatisticsThread extends Thread{
    public final FestivalGate gate;

    public FestivalStatisticsThread(FestivalGate gate){
        this.gate = gate;
    }

    @Override
        public void run(){
            while(true) {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(!gate.getTicketsPurchased().isEmpty()) {
                    printStatistics();
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }

    private void printStatistics(){
        for (Map.Entry<TicketType, Integer> entry : gate.getTicketsPurchased().entrySet()){
            System.out.println(entry.getValue() + " tickets of type " + entry.getKey());
        }
    }
}
