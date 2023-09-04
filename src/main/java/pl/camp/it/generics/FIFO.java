package pl.camp.it.generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FIFO<T extends Comparable<T>> {
    private List<T> queue = new ArrayList<>();

    public void push(T element) {
        this.queue.add(element);
    }

    public T pop() {
        T element = this.queue.get(0);
        this.queue.remove(0);
        return element;
    }

    public void sort() {
        Collections.sort(queue);
    }
}
