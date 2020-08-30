package codechef.june;

import java.util.Scanner;

public class PRICECON {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while(T > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int loss = 0;
            for (int i = 0 ; i < n ; i++) {
                int val = sc.nextInt();
                if (val > k) {
                    loss += (val-k);
                }

            }
            System.out.println(loss);
            T--;
        }


    }

}
