package algorithm_tut.implementation;

// GCD
public class ImportantMath {
    private int generateGCD(int a,int b){

        if (b==0) return a;
        else return generateGCD(b,a%b);

    }
}
