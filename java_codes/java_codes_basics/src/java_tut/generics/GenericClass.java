package java_tut.generics;

/**
 * Created by satyapriyakrishna on 7/3/20.
 */
public class GenericClass<T, T1> {
    T x;
    T1 y;

    void setX(T x) {
        this.x = x;
    }

    void setY(T1 y) {
        this.y = y;
    }

}
