package codeforces.practice.dp;

import java.util.Scanner;

public class HittheLottery {
    public static void printInteger(int result) {
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n=sc.nextInt();

        c=n/100+n%100/20+n%20/10+n%10/5+n%5;
        System.out.println(c);

    }
}
