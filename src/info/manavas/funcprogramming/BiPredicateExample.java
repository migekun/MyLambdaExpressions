package info.manavas.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class BiPredicateExample {
    public static void main(String[] args) {

        List<Instructor> instructors = Instructors.getAll();
        //BiPredicate
        BiPredicate<Boolean, Integer> p3 = (online, experience) -> online && experience > 10;

        //BiConsumer
        BiConsumer<String, List<String>> biConsumer = (name, courses) -> System.out.println("name: " + name + " courses: " + courses);

        instructors.forEach(instructor -> {
            if (p3.test(instructor.isOnlineCourse(), instructor.getYearsOfExperience())) {
                biConsumer.accept(instructor.getName(), instructor.getCourses());
            }
        });
    }
}
