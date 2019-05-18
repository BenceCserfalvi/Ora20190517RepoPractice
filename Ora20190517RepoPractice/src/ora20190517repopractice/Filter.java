package ora20190517repopractice;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author progmatic
 */
public class Filter {
    
    public static List<Person> cityFilter(String city, List<Person> list){
        for (Iterator<Person> it = list.iterator(); it.hasNext();) {
            Person next = it.next();
            if (!next.getCity().equals(city)) {
                it.remove();
            }
        }
        return list;
    }
    
    
}
