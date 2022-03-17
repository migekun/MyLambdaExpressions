package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class CollectorsMinMaxExample {
    public static void main(String[] args) {
        //instructors with minimum years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .collect(Collectors.minBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("instructor - min1 = " + (instructor.isPresent()?instructor.get():"NO data"));
        instructor = Instructors.getAll().stream()
                .min(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor - min2 = " + (instructor.isPresent()?instructor.get():"NO data"));
        System.out.println("----------------");
        instructor = Instructors.getAll().stream()
                .max(Comparator.comparing(Instructor::getYearsOfExperience));
        System.out.println("instructor - max1 = " + (instructor.isPresent()?instructor.get():"NO data"));
        instructor = Instructors.getAll().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Instructor::getYearsOfExperience)));
        System.out.println("instructor - max2 = " + (instructor.isPresent()?instructor.get():"NO data"));
    }
}
