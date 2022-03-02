package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Set;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        //return only instructor names from the instructor list
        Set<String> instructorsNames = Instructors.getAll().stream()
                .map(Instructor::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(instructorsNames);
    }
}
