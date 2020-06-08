package codeforces.practice;

import java.util.Scanner;

public class Watermelon {

    public static void printYES() {
        System.out.println("YES");
    }

    public static void printNO() {
        System.out.println("NO");
    }


    public static  void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt();

        if (weight%2 != 0) {
            printNO();
        } else {
            weight /= 2;
            if(weight != 1) {
                printYES();
            } else {
                printNO();
            }
        }


    }
}
