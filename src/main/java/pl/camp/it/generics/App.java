package pl.camp.it.generics;

import java.util.Optional;

public class App {
    public static void main(String[] args) {
        Box box = new Box(Integer.valueOf(4));
        Box box2 = new Box("string");

        Integer i = (Integer) box.getContent();

        Box2<Integer> betterBox = new Box2<>(Integer.valueOf(4));
        Integer i2 = betterBox.getContent();

        Pair<String, String> para1 = new Pair<>("a", "b");
        String a = para1.getFirst();
        String b = para1.getSecond();

        Pair<Integer, Boolean> para2 = new Pair<>(4, true);
        int x = para2.getFirst();
        boolean y = para2.getSecond();

        Triplet<Integer, Boolean, Double> triplet = new Triplet<>();
        triplet.setFirst(5);
        triplet.setSecond(true);
        triplet.setThird(5.5);

        FIFO<String> fifo1 = new FIFO<>();
        fifo1.push("abc");
        fifo1.push("xyz");

        System.out.println(fifo1.pop());
        System.out.println(fifo1.pop());

        FIFO<Integer> fifo2 = new FIFO<>();
        fifo2.push(4);
        fifo2.push(7);

        System.out.println(fifo2.pop());

        fifo2.push(9);
        System.out.println(fifo2.pop());
        System.out.println(fifo2.pop());

        FIFO<String> fifo3;
        //FIFO<Triplet<Integer,Integer,Integer>> fifo4;

        cos(Optional.of(new Triangle()));

        Box2<?> box3 = metoda(false);
        Object t = box3.getContent();
        if(t instanceof Triangle) {
            Triangle t2 = (Triangle) t;
        }
        box3.content = null;

        Figure f = new Triangle();

        //Box2<Figure> figureBox2 = new Box2<Triangle>(new Triangle());
    }

    public static void cos(Optional<? super Figure> param) {
    }

    public static <T> T metoda(T t) {
        return t;
    }

    public static Box2<?> metoda(boolean x) {
        if(x) {
            return new Box2<>(new Triangle());
        } else {
            return new Box2<>(new Circle());
        }
    }
}
