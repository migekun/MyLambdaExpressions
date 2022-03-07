package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamComparatorExample {
    public static void main(String[] args) {
        //returning all instructors sorted by their name
        List<Instructor> list = Instructors.getAll().stream()
//                .sorted(Comparator.comparing(Instructor::getName))
                .sorted(Comparator.comparing(Instructor::getName).reversed())
                .collect(Collectors.toList());
        list.forEach(System.out::println);

    }
}
