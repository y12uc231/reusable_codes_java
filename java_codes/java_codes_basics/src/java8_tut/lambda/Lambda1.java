package java8_tut.lambda;

import java.util.Comparator;

/**
 * Created by satyapriyakrishna on 7/26/20.
 */
public class Lambda1 {

    public static void main(String[] args) {
        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.print(stringComparator.compare("hello", "world"));

        Comparator<String> strCompLambda = (o1, o2) -> {
            return o1.compareTo(o2); };

        System.out.println(strCompLambda.compare("hello" , "world"));


    }
}
