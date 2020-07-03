package codeforces.dp_practice;

import java.util.Scanner;

/**
 * Created by satyapriyakrishna on 6/15/20.
 */
public class ProblemEquivalentStrings {

    public static void printBoolean(boolean inp) {
        if (inp) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static boolean helper(String str1, String str2) {
        if (str1.equals(str2)) {
            return true;
        } else {
            return (helper(str1.substring(0, str1.length()/2), str2.substring(0, str2.length()/2)) &&
                    helper(str1.substring(str1.length()/2, str1.length()), str2.substring(str2.length()/2, str2.length())))
                    || (helper(str1.substring(0, str1.length()/2), str2.substring(0, str2.length()/2)) &&
                    helper(str1.substring(str1.length()/2, str1.length()), str2.substring(str2.length()/2, str2.length())));

        }
    }

    public static void main (String[] args) {

        Scanner sc  = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            printBoolean(false);
        }



    }

}
