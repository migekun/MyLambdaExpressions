package info.manavas.streams;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.LongStream;

public class LongStreamExample {
    public static void main(String[] args) {
        //using of
        LongStream numbers = LongStream.of (1,2,3,4,5);
        numbers.forEach(System.out::println);
        System.out.println("End of -----------");

        //iterate
        numbers = LongStream.iterate(0, i->i+2).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("end iterate -----------");

        //Random generator
        numbers = LongStream.generate(ThreadLocalRandom.current()::nextLong).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("end random -----------");

        //range
        numbers = LongStream.range(1, 5);
        numbers.forEach(System.out::println);
        System.out.println("end range(1, 5) -----------");

        //rangeClosed
        numbers = LongStream.rangeClosed(1,5);
        numbers.forEach(System.out::println);
        System.out.println("end range closed (1, 5) -----------");

    }
}
