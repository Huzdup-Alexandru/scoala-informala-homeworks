/**
 * Created by Huzdu on 3/8/2017.
 */
public class Location {
    private String city;
    private int distance;

    public Location(String city, int distance) {
        this.city = city;
        this.distance = distance;
    }

    public String getCity() {
        return this.city;
    }

    public int getDistance() {
        return this.distance;
    }
}

