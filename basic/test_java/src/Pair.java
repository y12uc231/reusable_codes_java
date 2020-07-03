import java.util.Map;

/**
 * Created by satyapriyakrishna on 7/3/20.
 */
public class Pair<T,T2> implements Map.Entry {
    T x;
    T2 y;
    public static <E, E2> void addPairs(Pair<E, E2> p1 , Pair<E, E2> p2) {
        System.out.print("Complete static function");
    }
    Pair(T x, T2 y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public T getKey() {
        return x;
    }

    @Override
    public T2 getValue() {
        return y;
    }

    @Override
    public T2 setValue(Object value) {
        y = (T2) value;
        return y;
    }
}
