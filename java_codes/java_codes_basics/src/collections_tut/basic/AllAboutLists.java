package collections_tut.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

// https://docs.oracle.com/javase/8/docs/api/java/util/List.html
// https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

public class AllAboutLists {
    public static void main(String[] args) {
        //List<int[]> objs = new ArrayList<>(List.of(new int[]{1,3}, new int[]{4,4},
         //                                           new int[]{1,1}, new int[]{4,2}));

        List<Integer> objs = new ArrayList<>(List.of(Integer.valueOf(2), Integer.valueOf(3)));
        Arrays.sort(objs, (a, b) -> {return a.compareTo(b) ;});

        //Arrays.sort(objs, (a,b) -> {return a[0] - b[0];});

    }
}
