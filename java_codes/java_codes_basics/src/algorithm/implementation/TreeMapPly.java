package algorithm.implementation;

import java.util.*;

public class TreeMapPly {
    public static void main(String[] args) {
        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        map.put(1,5);
        map.put(3,4);
        System.out.println(map.firstEntry().getKey());

        HashMap<Integer, Integer> map2 = new HashMap<>();
        map2.put(34, 43);
        map2.put(33, 12);
        Iterator<Map.Entry<Integer, Integer>> iter = map2.entrySet().iterator();
        while(iter.hasNext()) {
            Map.Entry<Integer, Integer> val = iter.next();
            System.out.println(val.getKey() + " "+  val.getValue());
        }
    }
}
