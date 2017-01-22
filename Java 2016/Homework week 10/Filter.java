import java.util.*;

/**
 * Created by Huzdu on 1/21/2017.
 */
public class Filter<T extends Comparable<T>> {
    private HashSet<FilterRule<T>> rules = new HashSet<>();

    public void addRule(FilterRule<T> rule){
        rules.add(rule);
    }

    public List<T> filter (List<T> unfilteredList){
        System.out.println("\n");
        List<T> filteredList = new ArrayList<>();
        for(T t : unfilteredList){
            Iterator<FilterRule<T>> iterator = rules.iterator();
            if (isFiltered(t, iterator)){
                filteredList.add(t);
                System.out.println("List contains " + filteredList);
            }
        }
        Collections.sort(filteredList);
        System.out.println("The sorted list is : ");
        return filteredList;
    }
    private boolean isFiltered(T t, Iterator<FilterRule<T>> iterator){
        if (iterator.hasNext()){
            FilterRule<T> rule = iterator.next();
            if(rule.filter(t)) {
                System.out.println(t + " passed " + rule.getFilterName());
                return isFiltered(t, iterator);
            } else {
                System.out.println(t + " did not pass " + rule.getFilterName());
                return false;
            }
        }
        return true;
    }
}
