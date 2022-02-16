package info.manavas.funcprogramming;

import java.util.function.*;

public class UnaryOperatorExample {
    public static void main(String[] args) {
        UnaryOperator<Integer> unary = integer -> integer * 10;
        System.out.println(unary.apply(100));
        Function<Integer, Integer> function = i -> i * 10;
        System.out.println(function.apply(100));

        IntUnaryOperator intUnaryOperator = i -> i * 10;
        System.out.println(intUnaryOperator.applyAsInt(100));

        LongUnaryOperator longUnaryOperator = i -> i * 10;
        System.out.println(longUnaryOperator.applyAsLong(1000000001));

        DoubleUnaryOperator doubleUnaryOperator = i-> i * 10;
        System.out.println(doubleUnaryOperator.applyAsDouble(20000000.2000000));
    }
}
