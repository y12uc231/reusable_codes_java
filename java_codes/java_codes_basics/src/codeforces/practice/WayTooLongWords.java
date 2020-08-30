package codeforces.practice;

import java.util.Scanner;

public class WayTooLongWords {

    public static void printString(String input){
        System.out.println(input);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n > 0) {
            String input = sc.next();
            if (input.length() <= 10) {
                printString(input);
            } else {
                printString(input.substring(0,1) + String.valueOf(input.length()-2) + input.substring(input.length()-1, input.length()));
            }
            n--;
        }

    }

}
