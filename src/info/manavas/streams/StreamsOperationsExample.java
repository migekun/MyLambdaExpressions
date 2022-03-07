package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsOperationsExample {
    public static void main(String[] args) {
        //count distinct
        long count = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .count()
                ;

        System.out.println("count = " + count);

        List<String> courses = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("courses = " + courses);

        //anymatch, allmatch and nonmatch
        boolean match = Instructors.getAll().stream()
                .map(Instructor::getCourses)
                .flatMap(List::stream)
//                .anyMatch(s-> s.startsWith("J"))
//                .allMatch(s-> s.startsWith("J"))
                .noneMatch(s-> s.startsWith("J"))
                ;
        System.out.println("match = " + match);
    }
}
