package generics;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public <V> void printWith(V third) {
        System.out.println("First: " + first + ", Second: " + second + ", Third: " + third);
    }

    /*public <V> void printWithAnother(Pair<V> another) {
        printWith(another);
    }*/

    public void printWithAnother(Pair<?> another) {
        printWith(another);
    }

    public <V extends Number> void add(Pair<V> nu2m) {
        System.out.println();
    }

    public <? extends Comparable<?>> void compare(V num) {
        System.out.println(num.compareTo(2) > 1);
    }
}
