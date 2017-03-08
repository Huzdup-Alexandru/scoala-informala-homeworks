

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

/**
 * Created by Huzdu on 3/7/2017.
 */

    public class PackageDeliveryThread extends Thread {
    private static final int COST_PER_KM = 3;
    private static final int DRIVER_SALARY_PER_KM = 1;
    private Package pack;
    private int profit;
    private int id;
    private boolean specificDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public PackageDeliveryThread(Package pack, int id, String targetDate) {
        this.profit = pack.getMerchandiseValue() - (COST_PER_KM * pack.getTargetLocation().getDistance()) - (DRIVER_SALARY_PER_KM * pack.getTargetLocation().getDistance());
        this.pack = pack;
        this.id = id;
        this.specificDate = this.verifyDate(targetDate);
    }

    public int getProfit() {
        return this.profit;
    }

    private boolean verifyDate(String targetDate) {
        return this.pack.getDeliveryDate().equals(LocalDate.parse(targetDate, this.formatter));
    }

    public void run() {
        Random random = new Random();
        while (this.pack.getDistanceToTheTarget() > 0) {
            try {
                System.out.println("Package : " + this.id + " have more " + this.pack.getDistanceToTheTarget() + " kilometers to the destination");
                this.pack.setDistanceToTheTarget(this.pack.getDistanceToTheTarget() - 1);
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        if (this.specificDate) {
            System.out.println("The package " + this.id + " arrived to the destination with this merchandise value: " + this.pack.getMerchandiseValue() + " and this profit: " + this.getProfit());
        } else {
            System.out.println("The package " + this.id + " arrived to the destination");
        }

    }
}



