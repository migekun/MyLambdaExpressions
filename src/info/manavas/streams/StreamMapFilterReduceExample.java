package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

public class StreamMapFilterReduceExample {
    public static void main(String[] args) {
        //total years of experience between instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourse)
                .map(Instructor::getYearsOfExperience)
                .reduce(0, Integer::sum);
        System.out.println("result = " + result);
    }
}
