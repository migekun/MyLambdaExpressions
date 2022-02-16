package info.manavas.funcprogramming;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

public class BinaryOperatorExample {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;
        System.out.println(binaryOperator.apply(2, 4));

        Comparator<Integer> comparator = (a, b) -> a.compareTo(b);
        BinaryOperator<Integer> maxBi = BinaryOperator.maxBy(comparator);
        System.out.println(maxBi.apply(7, 8));

        BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);
        System.out.println(minBy.apply(7, 8));

        IntBinaryOperator intBinaryOperator = (a,b) -> a*b;
        System.out.println(intBinaryOperator.applyAsInt(2, 4));

        LongBinaryOperator longBi = (a, b) -> a*b;
        System.out.println(longBi.applyAsLong(200000001L, 22222222222221L));

        DoubleBinaryOperator doubleBi = (a, b) -> a*b;
        System.out.println(doubleBi.applyAsDouble(2222.222222, 2222222222.2222222222222));

    }
}
