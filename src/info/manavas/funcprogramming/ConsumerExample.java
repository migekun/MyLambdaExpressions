package info.manavas.funcprogramming;

import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> consumer = (x) -> System.out.println(x.length() + " the value of x: " + x);
        consumer.accept("Up in the air");

        // Consumer with block statement
        Consumer<Integer> d = (x) -> {
            System.out.println("x*x = " + x*x);
            System.out.println("x/x = " + x/x);
        };
        d.accept(10);

    }
}
