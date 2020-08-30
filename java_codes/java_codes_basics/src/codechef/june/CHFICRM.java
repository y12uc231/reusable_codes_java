package codechef.june;

import java.util.HashMap;
import java.util.Scanner;

public class CHFICRM {

    public static boolean helper(int[] prices) {

            HashMap<Integer, Integer> repo = new HashMap<>();
            int[] coins = {5, 10, 15};

            for (int i : coins) {
                repo.put(i, 0);
            }

            for (int i : prices) {
                repo.put(i, repo.get(i)+1);
                int remainder = i-5;
                if (remainder == 10) {
                    if (repo.get(10) > 0) {
                        repo.put(10, repo.get(10)-1);
                    } else if (repo.get(5) > 1) {
                        repo.put(5, repo.get(5)-2);
                    } else {
                        return false;
                    }
                } else if (remainder > 0) {
                    if (repo.get(5) == 0) {
                        return false;
                    } else {
                        repo.put(5, repo.get(5)-1);
                    }
                }
            }

            return true;

        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int T = sc.nextInt();

            while(T>0) {
                int n = sc.nextInt();

                int[] prices = new int[n];
                for(int i = 0 ; i < prices.length ; i++) {
                    prices[i] = sc.nextInt();
                }

                boolean result = helper(prices);

                if(result == true) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }


                T--;
            }


    }

}
