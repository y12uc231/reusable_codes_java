/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. Code Chef Link : https://www.codechef.com/APRIL20B/problems/CARSELL/ */
class Solution2CodeChef
{
    public static int M =1000000007;
    public static void printString(String str) {
        System.out.println(str);
    }

    static int mod(int a, int m) {
        return (a%m + m) % m;
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        String priceString;
        String[] priceArray;
        int counter = 0;
        int profit = 0;
        int topPrice;
        PriorityQueue<Integer> pQueue;
        while (T > 0) {
            int N = Integer.parseInt(reader.readLine());
            priceString = reader.readLine();
            priceArray = priceString.split(" ");
            profit = 0;
            counter = N-1;
            pQueue = new PriorityQueue<Integer>();
            for (int i = 0 ; i < priceArray.length; i++ ) {
                pQueue.add(Integer.parseInt(priceArray[i]));
            }

            while (pQueue.isEmpty() == false) {
                topPrice = pQueue.poll();
                profit += (topPrice-counter) > 0? (topPrice-counter) : 0;
                profit = mod(profit, M);
                counter--;

            }
            printString(String.valueOf(profit));

            T--;
        }
    }


}
