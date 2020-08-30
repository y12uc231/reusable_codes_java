package codeforces.practice;

import java.util.Scanner;

public class TheatreSquare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long m = sc.nextInt();
        long n = sc.nextInt();
        long a = sc.nextInt();

        long hori = 0;
        long vertical = 0;
        if (m%a == 0) {
            vertical += m/a;
        } else {
            vertical += (m/a + 1);
        }


        if (n%a == 0) {
            hori += n/a;
        } else {
            hori += (n/a + 1);
        }

        System.out.println(vertical*hori);


    }
}
