package info.manavas.funcprogramming;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        //printing out two numbers

        BiConsumer<Integer, Integer> biConsumer = (x, y) -> System.out.println("x: " + x + " y: " + y);
        biConsumer.accept(2, 4);
        BiConsumer<Integer, Integer> biConsumer1 = (x, y) -> System.out.println("x+y: " + (x + y));
        biConsumer1.accept(2, 4);
        BiConsumer<String, String> biConsumer2 = (x, y) -> System.out.println("sout: " + (x + y));
        biConsumer2.accept("String 1", "String 2");
    }
}
