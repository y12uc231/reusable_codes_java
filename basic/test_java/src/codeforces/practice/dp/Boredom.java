//package codeforces.practice.dp;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Boredom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Integer[] arr = new Integer[size];
        for(int i = 0 ; i < size ; i++) {
            arr[i] = sc.nextInt();
        }

        if (arr.length == 1) {
            System.out.println(arr[0]);
        } else {
            Arrays.sort(arr);
            HashMap<Integer, Integer> freq = new HashMap<>();
            int currEle = arr[0];
            int freqEle = 1;
            for (int i=1; i < arr.length ; i++) {
                if (currEle != arr[i]) {
                    freq.put(currEle, freqEle);
                    currEle = arr[i];
                    freqEle = 1;
                } else {
                    freqEle++;
                }
            }
            freq.put(currEle, freqEle);

            int[] dpLeft = new int[arr.length+1];
            int[] dpRight = new int[arr.length+1];
            //Arrays.sort(arr, Collections.reverseOrder());


            for (int i = 1; i < dpLeft.length ; ) {
                int val = arr[i-1];
                int sum = val * freq.get(val);
                int end = i-1;
                if (freq.containsKey(val-1)) {
                    end -= freq.get(val-1);
                }
                dpLeft[i] = Math.max(sum + dpLeft[end], dpLeft[i-1]);
                int freqAssign = freq.get(arr[i-1])-1;
                while(freqAssign > 0) {
                    dpLeft[i+freqAssign] = dpLeft[i];
                    freqAssign--;
                }
                i+= freq.get(val);

            }

            int result = 0;
            for (int i = dpRight.length-2; i >= 0 ;) {
                int val = arr[i];
                int end = i;
                int sum = val * freq.get(val);
                if (freq.containsKey(val+1)) {
                    end += freq.get(val+1);
                }
                dpRight[i] = Math.max(sum + dpRight[end+1],dpRight[i+1]) ;
                result = Math.max(result, dpRight[i]+dpLeft[i+1]-sum);
                int freqAssign = freq.get(arr[i])-1;
                while(freqAssign > 0) {
                    dpRight[i-freqAssign] = dpRight[i];
                    freqAssign--;
                }
                i-= freq.get(arr[i]);

            }



            System.out.println(result);


        }





    }
}
