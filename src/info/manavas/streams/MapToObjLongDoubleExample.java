package info.manavas.streams;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class MapToObjLongDoubleExample {
    public static void main(String[] args) {
        List<RandomIDs> randomIds = IntStream.rangeClosed(0,5)
                .mapToObj((i)-> new RandomIDs(i, ThreadLocalRandom.current().nextInt(100)))
                .collect(Collectors.toList());

        randomIds.forEach(System.out::println);
        System.out.println("------");

        LongStream longStream = IntStream.rangeClosed(0,5).mapToLong(i-> (long)i);
        longStream.forEach(System.out::println);
        System.out.println("------");

        DoubleStream doubleStream = LongStream.rangeClosed(0,5).mapToDouble(i-> (double)i);
        doubleStream.forEach(System.out::println);
        System.out.println("------");
    }
}
class RandomIDs {
    int id;
    int randomNumber;

    public RandomIDs(int id, int randomNumber) {
        this.id = id;
        this.randomNumber = randomNumber;
    }

    @Override
    public String toString() {
        return "RandomIDs{" +
                "id=" + id +
                ", randomNumber=" + randomNumber +
                '}';
    }
}
