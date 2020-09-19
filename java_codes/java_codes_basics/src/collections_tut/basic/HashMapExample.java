package collections_tut.basic;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by satyapriyakrishna on 7/3/20.
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 5);
        map.put(4, 5);
        Iterator<Map.Entry<Integer, Integer>> iter = map.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<Integer, Integer> entry = iter.next();
            System.out.println("Key : " + entry.getKey() + " Value : " + entry.getValue() );
        }
    }
}
