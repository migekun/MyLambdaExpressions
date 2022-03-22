package info.manavas.parallelStream;

import java.util.stream.IntStream;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Sum sequential: " + sumSequencialStream());
        System.out.println("Sum parallel: " + sumParallelStream());
    }

    public static int sumSequencialStream() {
        return IntStream.rangeClosed(0, 50000).sum();
    }

    public static int sumParallelStream() {
        return IntStream.rangeClosed(0, 50000).parallel().sum();
    }
}
