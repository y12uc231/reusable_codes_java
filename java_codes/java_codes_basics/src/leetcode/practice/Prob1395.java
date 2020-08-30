package leetcode.practice;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Prob1395 {
    public static int numTeams(int[] rating) {

        if (rating.length < 3) {
            return 0;
        }

        SortedSet<Integer> decreasingVals = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.intValue() - o1.intValue();
            }
        });
        for (int i = 1; i< rating.length ; i++) {
            decreasingVals.add(rating[i]);
        }

        SortedSet<Integer> increasingVals = new TreeSet<>();

        int teams = 0;
        increasingVals.add(rating[0]);

        for (int i = 1; i <  rating.length ; i++) {
            System.out.println(rating[i]);
            System.out.println(increasingVals.headSet(rating[i]).size() + " " + decreasingVals.headSet(rating[i]).size());
            teams += increasingVals.headSet(rating[i]).size() * decreasingVals.headSet(rating[i]).size();
            increasingVals.add(rating[i]);
            decreasingVals.remove(rating[i]);
        }
        return teams;
    }

    public static void main(String[] args) {
        int[] test  = {2,5,3,4,1};
        System.out.println(numTeams(test));
    }

}
