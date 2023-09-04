package pl.camp.it.generics;

public class Box2<T> {
    public T content;

    public Box2(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }
}
