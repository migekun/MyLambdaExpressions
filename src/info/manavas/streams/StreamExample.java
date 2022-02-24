package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //creating a map of names and course of instructors who teaches
        //online have more than 10 year of experience

        Predicate<Instructor> p1 = (i) -> i.isOnlineCourse();
        Predicate<Instructor> p2 = (i) -> i.getYearsOfExperience() > 10;

        List<Instructor> list = Instructors.getAll();

        Map<String, List<String>> map = list.stream()
//                .peek(s-> System.out.println(s))
                .filter(p1)
//                .peek(s-> System.out.println(s))
                .filter(p2)
                .peek(s-> System.out.println(s))
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
//peek es una operación intermedia que nos da el estado del stream en el punto en el que lo llamamos

//        System.out.println(map);
//
//        Map<String, List<String>> map2 = list.stream()
//                .filter(p2)
//                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));
//
//        System.out.println(map2);
    }
}
