package java_tut.java8Features;

public interface In {
    public int add(int a, int b) ;

    // Default function is not needed to be reimplemented.
    default  int multiply(int a, int b) {
        return a*b;
    }
}
