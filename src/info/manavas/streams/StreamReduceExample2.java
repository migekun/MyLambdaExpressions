package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Optional;

public class StreamReduceExample2 {
    public static void main(String[] args) {
        //printing the instructor who has the highest years of experience
        Optional<Instructor> instructor = Instructors.getAll().stream()
                .reduce((s1, s2) ->
                     s1.getYearsOfExperience() > s2.getYearsOfExperience() ? s1 : s2
                );

        //equivalentes
        //instructor.ifPresent(value -> System.out.println("instructor = " + value));
        if (instructor.isPresent()) System.out.println("instructor = " + instructor.get());
    }
}
