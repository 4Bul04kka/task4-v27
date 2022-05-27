public class SomeClass implements Comparable<SomeClass>{
    int a;

    public SomeClass(int a) {
        this.a = a;
    }

    @Override
    public int compareTo(SomeClass b) {
        return a - b.a;
    }

    @Override
    public String toString() {
        return a + "";
    }
}
