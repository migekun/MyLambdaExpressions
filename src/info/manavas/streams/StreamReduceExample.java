package info.manavas.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
//        List<Integer> numbers = Arrays.asList();
        int results = numbers.stream()
                //identity 0 -> 0 + 1 = 1       //identity 10 -> 10 + 5 = 15    //identity 36 -> 36 + 9 = 45
                //identity 1 -> 1 + 2 = 3       //identity 15 -> 15 + 6 = 21
                //identity 3 -> 3 + 3 = 6       //identity 21 -> 21 + 7 = 28
                //identity 6 -> 6 + 4 = 10      //identity 28 -> 28 + 8 = 36
                .reduce(0, (a,b) -> a + b);
        int results1 = numbers.stream()
                //identity 1 -> 1 * 1 = 1
                //identity 1 -> 1 * 2 = 2
                //identity 2 -> 2 * 3 = 6
                //identity 6 -> 6 * 4 = 24 ...
//                .reduce(1, (a,b) -> a * b);
                .reduce(0, (a,b) -> a * b);
        System.out.println("results = " + results);
        System.out.println("results1 = " + results1);

        Optional result2 = numbers.stream().reduce((a, b)-> a+b);
        if (result2.isPresent()) System.out.println("result2 = " + result2.get());

    }
}
