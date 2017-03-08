import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Created by Huzdu on 3/7/2017.
 */
public class Package {
    public static final int PRICE_PER_KM = 10;
    private Location targetLocation;
    private int distanceToTheTarget;
    private int merchandiseValue;
    private LocalDate deliveryDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public Package(Location targetLocation, String deliveryDate) {
        this.targetLocation = targetLocation;
        this.distanceToTheTarget = targetLocation.getDistance();
        this.merchandiseValue = this.distanceToTheTarget * 10;
        this.deliveryDate = LocalDate.parse(deliveryDate, this.formatter);
    }

    public Location getTargetLocation() {
        return this.targetLocation;
    }

    public int getDistanceToTheTarget() {
        return this.distanceToTheTarget;
    }

    public void setDistanceToTheTarget(int distanceToTheTarget) {
        this.distanceToTheTarget = distanceToTheTarget;
    }

    public int getMerchandiseValue() {
        return this.merchandiseValue;
    }

    public LocalDate getDeliveryDate() {
        return this.deliveryDate;
    }


}


