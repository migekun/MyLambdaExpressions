package info.manavas.funcprogramming;

import java.util.function.Predicate;

public class ConvertToMethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p2 = ConvertToMethodReferenceExample::greaterThanTenYearsExperience;

        Instructors.getAll().forEach(instructor -> {
            if (p2.test(instructor)) {
                System.out.println(instructor);
            }
        });
    }

    public static boolean greaterThanTenYearsExperience(Instructor instructor) {
        return instructor.getYearsOfExperience() > 10;
    }
}
