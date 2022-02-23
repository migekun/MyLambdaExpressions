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
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map);

        Map<String, List<String>> map2 = list.stream()
                .filter(p2)
                .collect(Collectors.toMap(Instructor::getName, Instructor::getCourses));

        System.out.println(map2);
    }
}
