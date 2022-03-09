package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Optional;

public class StreamFindAnyAndFindFirstExample {
    public static void main(String[] args) {
        Optional<Instructor> instructorOptional = Instructors.getAll().stream()
                .findAny();
        if(instructorOptional.isPresent()) System.out.println("instructorOptional = " + instructorOptional.get());
        instructorOptional = Instructors.getAll().stream().findFirst();
        if (instructorOptional.isPresent()) System.out.println("instructorOptional = " + instructorOptional.get());
    }
}
