package kickstart.practice;


import java.util.*;


public class Solution {

    public static int solutionFunction(int[] prices, int B) {
        Arrays.sort(prices);
        int result = 0;
        for(int i = 0 ; i < prices.length ; i++) {
            if (B >= prices[i]) {
                result++;
                B -= prices[i];
            } else {
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cases = 1;
        while (cases <= T ) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int[] prices = new int[A];
            for (int i = 0; i < A ; i++) {
                prices[i] = sc.nextInt();
            }
            int result = solutionFunction(prices, B);
            System.out.println("Case #"+cases+": "+result);

            cases++;
        }


    }

}
