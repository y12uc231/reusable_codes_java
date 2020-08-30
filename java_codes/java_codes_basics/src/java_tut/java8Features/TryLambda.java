package java_tut.java8Features;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/****
 * Tutorial Link  : https://winterbe.com/posts/2014/03/16/java-8-tutorial/
 *
 */
public class TryLambda {
    public static void main (String[] args) {
        // OlderVersion
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        Collections.sort(names, new Comparator<String>() {
            public int compare(String a, String b) {
                return b.compareTo(a);
            }
        });
        ////////

        //// Lambda Version
        Collections.sort(names, (String a, String b) -> {
            return b.compareTo(a);
        });
        //////////

        /// Improved Lambda
        Collections.sort(names, (String a, String b) -> b.compareTo(a));
        //////

        //// Even better
        Collections.sort(names, (a, b) -> b.compareTo(a));
        ////////

    }
}
