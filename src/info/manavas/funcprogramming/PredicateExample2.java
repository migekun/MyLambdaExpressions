package info.manavas.funcprogramming;

import java.util.List;
import java.util.function.Predicate;

public class PredicateExample2 {

    public static void main(String[] args) {
        //all instructor who teaches online

        Predicate<Instructor> p1 = (instructor) -> instructor.isOnlineCourse();
        Predicate<Instructor> p2 = (instructor) -> instructor.getYearsOfExperience() > 10;
        List<Instructor> instructorList = Instructors.getAll();
        instructorList.forEach(instructor -> {
            if (p1.test(instructor)){
                System.out.println(instructor);
            }
        });
        System.out.println("---------------------------");
        //is instructor teaches online and more than 10 years experience
        instructorList.forEach(instructor -> {
            if (p1.and(p2).test(instructor)){
                System.out.println(instructor);
            }
        });

    }
}
