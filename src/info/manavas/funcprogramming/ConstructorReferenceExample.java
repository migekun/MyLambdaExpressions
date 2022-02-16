package info.manavas.funcprogramming;

import java.util.Arrays;

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        InstructorFactory instructorFactory = Instructor::new;
        Instructor instructor = instructorFactory.get("Mike", 10, "Software Developer", "M", true, Arrays.asList("Java Programming", "C++ Programing", "Python Programming"));

        System.out.println(instructor);
    }
}
