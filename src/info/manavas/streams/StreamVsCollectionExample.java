package info.manavas.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Mike", "Syed", "Antonio"));
        System.out.println("-----------");
        System.out.println(names);

        names.remove("Syed");
        System.out.println("-----------");
        System.out.println(names);

        System.out.println("1 -----------");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("2 -----------");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println("Stream -----------");
        Stream<String> nameStream = names.stream();
        nameStream.forEach(System.out::println);
//        nameStream.forEach(System.out::println); no deja hacerlo una segunda vez
        System.out.println("Stream filter -----------");
        List<String> list2 = names.stream().filter(s->s.startsWith("M")).collect(Collectors.toList());
        System.out.println(list2);
    }
}
