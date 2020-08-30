package java_tut.basics;

/**
 * Created by satyapriyakrishna on 7/26/20.
 */
abstract class T1 {
    void printHello(String val1) {
        System.out.println("Interface : " + val1);
    }

    int add(int a, int b) {
        return a+b;
    }
}
public class TestInterface1 extends T1 {

}
