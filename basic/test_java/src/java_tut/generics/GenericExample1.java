package java_tut.generics;

/**
 * Generics is to allow type safe generic modules
 * Generic function, class and interfaces
 * Bounded generic type
 * Wildcard
 */
public class GenericExample1 {
    public static <T extends Number> double addTwoNums(T num1 , T num2) {
        return num1.doubleValue() + num2.doubleValue() ;
    }
}

