package codeforces.practice.dp;

import java.util.Arrays;
import java.util.Scanner;

public class CutRibbon {
    public static void printInteger(int result) {
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] sizes = new int[3];
        for (int i = 0 ; i < 3 ; i++) {
            sizes[i] = sc.nextInt();
        }

        int[] dp = new int[length+1];
        dp[0] =0;
        for (int i = 1 ; i < length+1 ; i++) {
            for (int j = 0 ; j < sizes.length ; j++) {
                if (i-sizes[j] >0 && dp[i-sizes[j]]>0) {
                    dp[i] = Math.max(dp[i-sizes[j]]+1, dp[i]); //Math.max(dp[i-sizes[j]]+1, dp[i]);
                } else if (i-sizes[j] == 0) {
                    dp[i] = Math.max(dp[i-sizes[j]]+1, dp[i]);
                }
            }
        }

        printInteger(dp[length]);

    }
}
