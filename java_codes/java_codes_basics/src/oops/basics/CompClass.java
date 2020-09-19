package oops.basics;

public class CompClass implements Comparable<CompClass>{
    int val1;
    int val2;

    @Override
    public int compareTo(CompClass o) {
        return this.val1 - o.val1;
    }

    public static void main(String[] args) {
        CompClass[] objs = new CompClass[2];
        objs[0] = new
    }

}

