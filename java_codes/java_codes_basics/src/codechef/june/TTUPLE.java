package codechef.june;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class TTUPLE {

    public static int helper(int[] first, int[] second) {

        int[] diff = new int[3];
        int[] mult = new int[3];

        for(int i = 0 ; i < 3 ; i++) {
            diff[i] = second[i] - first[i];
            if (first[i] == 0) {
                mult[i] = 0;
            } else {
                mult[i] = second[i]/first[i];
            }

        }

        int total_steps = 3;

        //Check for zeros
        HashSet<Integer> same_diffs = new HashSet<>();
        HashSet<Integer> same_mults = new HashSet<>();
        int m_zeros = 0 ;
        int d_zeros = 0;
        for(int i = 0 ; i < 3 ; i++) {
            if (diff[i] != 0) {
                same_diffs.add(diff[i]);
            } else {
                d_zeros++;
            }
            if(mult[i] == 0) {
                m_zeros++;
            } else {
                same_mults.add(mult[i]);
            }

        }

        total_steps = Math.min(total_steps, same_diffs.size());

        total_steps = Math.min(total_steps, same_mults.size() +m_zeros-d_zeros );

        return total_steps;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T > 0) {

            int[] first = new int[3];
            int[] second = new int[3];

            for(int i = 0; i < 3 ; i++) {
                first[i] = sc.nextInt();
            }

            for(int i = 0 ; i < 3 ; i++) {
                second[i] = sc.nextInt();
            }

            System.out.println(helper(first,second));

            T--;
        }

        /// TESTING
//        Random rand = new Random();
//        for (int i = -10 ; i < 11 ; i++ ) {
//            for (int j = -10 ; j < 11 ; j++) {
//                for(int k = -10 ; k < 11 ; k++) {
//                    int[] first = {i, j , k};
//                    int[] second = {i + rand.nextInt(10), j + rand.nextInt(10) , k  + rand.nextInt(10)};
//                    System.out.println(helper(first,second));
//                }
//            }
//        }

    }
}
