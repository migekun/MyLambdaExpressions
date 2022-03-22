package info.manavas.parallelStream;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class StreamPerformanceExample1 {
    static long tokenCount = 50000;
    public static void main(String[] args) {
        int loop = 20;
        long result = measurePerformance(StreamPerformanceExample1::sortSequeltialStream, loop);
        System.out.println("Time taken to process sequential = " + result);
        result = measurePerformance(StreamPerformanceExample1::sortParallelStream, loop);
        System.out.println("Time taken to process parallel = " + result);
    }

    public static long measurePerformance(Supplier<Long> supplier, int numberOrTimes) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < numberOrTimes; i++) {
            supplier.get();
        }
        return  System.currentTimeMillis() - startTime;
    }

    public static long sortSequeltialStream () {
        List<RandomToken> randomTokens = LongStream.rangeClosed(0, tokenCount)
                .mapToObj((i) -> new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount)))
                .collect(Collectors.toList());
        randomTokens.stream().sorted(Comparator.comparing(RandomToken::getToken));
        return -1;
    }

    public static long sortParallelStream () {
        List<RandomToken> randomTokens = LongStream.rangeClosed(0, tokenCount)
                .parallel().mapToObj((i) -> new RandomToken(i, ThreadLocalRandom.current().nextLong(tokenCount)))
                .collect(Collectors.toList());
        randomTokens.stream().parallel().sorted(Comparator.comparing(RandomToken::getToken));
        return -1;
    }
}

class RandomToken {
    long id;
    long token;

    public RandomToken(long id, long token) {
        this.id = id;
        this.token = token;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getToken() {
        return token;
    }

    public void setToken(long token) {
        this.token = token;
    }
}