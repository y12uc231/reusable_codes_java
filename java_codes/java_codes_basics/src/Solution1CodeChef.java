import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. Codechef Link : https://www.codechef.com/APRIL20B/problems/COVIDLQ */
class Codechef
{
    public static void printString(String str) {
        System.out.println(str);
    }

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(reader.readLine());
        int N;
        String lineArrangement;
        String[] lineArrangmentArray;
        int[] intLineArrangement;
        int counter ;
        boolean resultPrinted;
        while (T > 0) {
            N = Integer.parseInt(reader.readLine());
            lineArrangement = reader.readLine();
            lineArrangement = lineArrangement.substring(lineArrangement.indexOf('1'), lineArrangement.length());
            lineArrangmentArray = lineArrangement.split(" ");
            intLineArrangement = new int[lineArrangmentArray.length];
            for (int i = 0 ; i < lineArrangmentArray.length; i++ ) {
                intLineArrangement[i] = Integer.parseInt(lineArrangmentArray[i]);
            }
            counter = 0;
            resultPrinted = false;
            for (int i = 1; i < intLineArrangement.length ; i++) {
                if (intLineArrangement[i] == 1) {
                    if (counter < 5) {
                        printString("NO");
                        resultPrinted = true;
                        break;
                    } else {
                        counter = 0;
                    }
                } else {
                    counter += 1;
                }
            }
            if (resultPrinted == false) {
                printString("YES");
            }
            T--;
        }
    }
}
