package collections_tut.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TryList {

    public static void main(String[] args) {
        List<Integer> var = new ArrayList<>() ;
        var.add(123);
        var.add(12);
        List<Integer> example = new ArrayList<>();
        example.addAll(var);
        System.out.println(Arrays.toString(var.toArray()));
    }
}
