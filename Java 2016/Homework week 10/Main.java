import java.util.Arrays;
import java.util.List;

/**
 * Created by Huzdu on 1/21/2017.
 * @version 1.0
 *
 *Application to sort objects, string and numbers with generics.
 */
public class Main {
    public static void main(String[] args) {
        Shoes Etnies1 = new Shoes(41,"Etnies", "Marana");
        Shoes Etnies2 = new Shoes(40,"Etnies","Marana Vulc");
        Shoes Supra1 = new Shoes(44,"Supra","Skytop III");
        Shoes Supra2 = new Shoes (45, "Supra", "Vaider");
        Shoes Supra3 = new Shoes (41, "Supra", "Bandit");
        Shoes Vans = new Shoes (39, "Vans", "Old skool");
        Shoes Volcom1 = new Shoes (42, "Volcom", "Seventy Seven");
        Shoes Volcom2 = new Shoes (47,"Volcom","Del Mesa");

        List<Shoes> shoes = Arrays.asList(new Shoes[]{Etnies1, Supra1, Etnies2, Supra2 , Volcom1, Supra3,Vans, Etnies1});
        Filter<Shoes> shoesFilter = new Filter<>();
        shoesFilter.addRule(new FilterRule<Shoes>() {
            @Override
            public boolean filter(Shoes data) {
                Shoes[] topShoes = new Shoes[] {Supra1,Supra3, Vans, Volcom2, Supra2, Volcom1, Etnies2};
                for(Shoes top : topShoes){
                    if(top.equals(data)){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public String getFilterName() {
                return "Shoes filter";
            }
        });
        List<String> names = Arrays.asList(new  String [] {"Sorin", "Alex", "Andrei", "Julia", "Ale", "Bogdan", "Dana","Felicia"});
        Filter<String> namesFilter = new Filter<>();
        namesFilter.addRule(new FilterRule<String>() {
            @Override
            public boolean filter(String data) {
                String[] girls = new String[] {"Ale", "Julia", "Dana", "Felicia"};
                for(String girl : girls){
                    if(girl.equals(data)){
                        return true;
                    }
                }
                return false;
            }

            @Override
            public String getFilterName() {
                return "Girls filter";
            }
        });
        List<Integer> numbers = Arrays.asList(new Integer[] { 3, 44, 21, 22, 38, 66, 69 , 70, 2, 4, 33, 18, 20 });
        Filter<Integer> numberFilter = new Filter<>();
        numberFilter.addRule(new FilterRule<Integer>() {
            @Override
            public boolean filter(Integer data) {
                Integer[] evenNumber = new Integer[] { 2, 4, 6, 8, 10, 20, 22, 18, 70, 66, 44};
                for (Integer even : evenNumber) {
                    if (even.equals(data)) {
                        return true;
                    }
                }
                return false;
            }

            @Override
            public String getFilterName() {
                return " Even verify";
            }
        });

        List<Shoes> filteredShoes = shoesFilter.filter(shoes);
        System.out.println(filteredShoes);
        List<String> filteredNames = namesFilter.filter(names);
        System.out.println(filteredNames);
        List<Integer> filteredNumbers = numberFilter.filter(numbers);
        System.out.println(filteredNumbers);
    }
}
