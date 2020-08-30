package java_tut.java8Features;

public class InheritingIn implements In {

    @Override
    public int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        InheritingIn obj1 = new InheritingIn();
        System.out.println(obj1.add(12, 23));
        System.out.println(obj1.multiply(4,5 ));
    }
}
