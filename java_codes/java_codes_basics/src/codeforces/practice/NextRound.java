package codeforces.practice;

import java.util.Scanner;

public class NextRound {

    public static void printString(String input){
        System.out.println(input);
    }
    public static void printNum(int input){
        System.out.println(input);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();


        int result = 0;
        int[] input = new int[n];

        for (int i = 0 ;i < n ; i++) {
            input[i] = sc.nextInt();
        }

        int kth = input[k-1];

        for (int i = 0 ;i < n ; i++) {
            if (input[i] <= 0 || input[i] < kth) {
                break;
            } else if (input[i] >= kth) {
                result++;
            }

        }


        printNum(result);

    }
}
