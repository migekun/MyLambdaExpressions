package info.manavas.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

public class BicConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //print out name and gender of instructors
        BiConsumer<String, String> biConsumer = (name, gender) -> System.out.println("Name: " + name + " gender: " + gender);

        instructors.forEach(instructor -> biConsumer.accept(instructor.getName(), instructor.getGender()));

        //print out name and list of courses
        BiConsumer<String, List<String>> biConsumer1 = (name, courses) -> System.out.println("Name: " + name + " courses: " + courses);

        instructors.forEach(instructor -> {
            biConsumer1.accept(instructor.getName(), instructor.getCourses());
        });

        //print out name and gender of all instructors who teaches online
        System.out.println("------------------------------------");
        instructors.forEach(instructor -> {
            if (instructor.isOnlineCourse()) biConsumer.accept(instructor.getName(), instructor.getGender());
        });

    }
}
