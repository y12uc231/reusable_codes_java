package codeforces.practice.dp;

import java.util.Scanner;

public class KefaandFirstSteps {

    public static void printIntResult(int val) {
        System.out.println(val);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size_arr = sc.nextInt();
        int maxIncSeq = 0;
        int currSeq = 0;
        int pastElement = 0;
        int currEle = 0;
        for (int i = 0 ; i < size_arr ; i++) {
            currEle = sc.nextInt();
            if (maxIncSeq == 0) {
                maxIncSeq = 1;
                currSeq = 1;
            } else {
                if (currEle >= pastElement) {
                    currSeq++;
                } else {
                    maxIncSeq = Math.max(maxIncSeq, currSeq);
                    currSeq = 1;
                }
            }
            pastElement = currEle;

        }
        maxIncSeq = Math.max(maxIncSeq, currSeq);
        printIntResult(maxIncSeq);

    }
}
