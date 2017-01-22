/**
 * Created by Huzdu on 1/21/2017.
 * @version 1.0
 * In this class I implement the shoes concept with simple characteristics: name, model and number.
 */
public class Shoes implements Comparable<Shoes> {
    private int number;
    private String name;
    private String model;

    public Shoes(int number, String name, String model){
        this.number = number;
        this.name = name;
        this.model = model;
    }
    public int getNumber(){
        return number;
    }

    public String toString(){
        return "\n" + "Name " + name + " Model " + model + " number " + number;
    }

// Method to sort the shoes depends on number.
    @Override
    public int compareTo(Shoes o) {
        if (this.getNumber() > o.getNumber()) {
            return 1;
        } else if (this.getNumber() < o.getNumber()) {
            return -1;
        }else {
            return 0;
        }
    }
}
