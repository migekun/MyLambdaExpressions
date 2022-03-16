package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.stream.Collectors;

public class CountingExample {
    public static void main(String[] args) {
        //count the number of instructors who teaches online courses
        //stream.count
        long count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .count();
        System.out.println("count 1 = " + count);

        count = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .collect(Collectors.counting());
        System.out.println("count 2 = " + count);
    }
}
