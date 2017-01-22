/**
 * Created by Huzdu on 1/21/2017.
 */
public interface FilterRule<T> {

    boolean filter(T data);
    String getFilterName();

}
