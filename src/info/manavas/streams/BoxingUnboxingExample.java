package info.manavas.streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnboxingExample {
    public static void main(String[] args) {
        List<Integer> numbers;

        IntStream numStream = IntStream.rangeClosed(0, 5000);//primitive int stream
        //numbers = numStream.boxed().toList(); java 16
        numbers = numStream.boxed().collect(Collectors.toList()); //Java 8
        numbers.forEach(System.out::println);

        Optional<Integer> sum = numbers.stream().reduce((a,b)->a+b);
        System.out.println("sum = " + (sum.isPresent()?sum.get():"No present"));
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum1 = " + sum1);
    }
}
