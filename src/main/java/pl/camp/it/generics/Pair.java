package pl.camp.it.generics;

public class Pair<T, X> {
    private T first;
    private X second;

    public Pair(T first, X second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public X getSecond() {
        return second;
    }
}
