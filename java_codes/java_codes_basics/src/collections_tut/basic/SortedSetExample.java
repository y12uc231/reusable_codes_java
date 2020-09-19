package collections_tut.basic;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

    public static void main(String[] args) {

        SortedSet<Integer> values = new TreeSet<>();

        values.add(12);
        values.add(13);
        values.add(14);
        values.add(1);

        System.out.println(values.first());
        System.out.println(((TreeSet<Integer>) values).headSet(13));


        SortedSet<Integer> values2 = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        values2.add(12);
        values2.add(13);
        values2.add(14);
        values2.add(1);
        System.out.println(((TreeSet<Integer>) values2).headSet(13));



    }

}
