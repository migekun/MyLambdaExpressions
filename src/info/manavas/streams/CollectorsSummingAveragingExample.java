package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.stream.Collectors;

public class CollectorsSummingAveragingExample {
    public static void main(String[] args) {
        //sum of year of experience of all instructors
        int sum = Instructors.getAll().stream().collect(Collectors.summingInt(Instructor::getYearsOfExperience));
        System.out.println("sum = " + sum);
        //calculate average years of experience of all instructors
        double average = Instructors.getAll().stream().collect(Collectors.averagingInt(Instructor::getYearsOfExperience));
        System.out.println("average = " + average);
    }
}
