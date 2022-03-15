package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningStreamExample {
    public static void main(String[] args) {
        String result = Stream.of("E", "F", "G", "H").collect(Collectors.joining());
        System.out.println("result1 = " + result);
        result = Stream.of("E", "F", "G", "H").collect(Collectors.joining(","));
        System.out.println("result2 = " + result);
        result = Stream.of("E","F", "G", "H").collect(Collectors.joining(",", "{","}"));
        System.out.println("result3 = " + result);

        //instructors names separated by ' and prefix { and suffix }
        String namesConcatenated = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.joining(",", "{", "}"));
        System.out.println("namesConcatenated = " + namesConcatenated);
    }
}
