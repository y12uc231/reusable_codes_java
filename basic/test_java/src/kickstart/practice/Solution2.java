package kickstart.practice;


import java.util.*;


public class Solution2 {

    public static int solutionFunction(int[][] beautyScores, int P) {
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int cases = 1;
        while (cases <= T ) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int P = sc.nextInt();
            int[][] beautyScores = new int[N][K];
            for (int i = 0; i < N ; i++) {
               for (int j = 0 ; j < K ; j++) {
                   beautyScores[i][j] = sc.nextInt();
               }
            }

            int result = solutionFunction(beautyScores, P);
            System.out.println("Case #"+cases+": "+result);

            cases++;
        }


    }

}
