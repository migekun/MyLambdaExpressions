package info.manavas.streams;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

public class DoubleStreamExample {
    public static void main(String[] args) {
        //using of
        DoubleStream numbers = DoubleStream.of (1.2,2.2,3.2,4.2,5.5);
        numbers.forEach(System.out::println);
        System.out.println("End of -----------");

        //iterate
        numbers = DoubleStream.iterate(0, i->i+2.0).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("end iterate -----------");

        //Random generator
        numbers = DoubleStream.generate(new Random()::nextDouble).limit(5);
        numbers.forEach(System.out::println);
        System.out.println("end random -----------");

        //range
        numbers = LongStream.range(1, 5).asDoubleStream();
        numbers.forEach(System.out::println);
        System.out.println("end range(1, 5) -----------");

        //rangeClosed
        numbers = LongStream.rangeClosed(1,5).asDoubleStream();
        numbers.forEach(System.out::println);
        System.out.println("end range closed (1, 5) -----------");

    }
}
