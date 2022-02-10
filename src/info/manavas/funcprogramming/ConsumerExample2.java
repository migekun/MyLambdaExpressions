package info.manavas.funcprogramming;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample2 {

    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        //Looping through all the instructor and printing the value
        Consumer<Instructor> c1 = (s1) -> System.out.println(s1);
        instructors.forEach(c1);

        System.out.println("-------------");
        //Loop through all instructor and only print the name
        Consumer<Instructor> c2 = (s1) -> System.out.println(s1.getName());
        instructors.forEach(c2);

        //Loop through all the instructors and print out their names and courses
        Consumer<Instructor> c3 = (s1) -> System.out.println(s1.getCourses());
        instructors.forEach(c2.andThen(c3));

        //Loop through all the instructors and print out their name if the years of experience is > 10
        System.out.println("--------------");

        instructors.forEach(s1 -> {
            if (s1.getYearsOfExperience() >10){
                c1.accept(s1);
            }
        });

        System.out.println("--------------");

        //Loop through all the instructors and print out their name and years of experience if years
        //of experience is > 5 and teaches courses online
        instructors.forEach(s1 -> {
            if (s1.getYearsOfExperience() > 5 && s1.isOnlineCourse()){
                c1.andThen(c2).accept(s1);
            }
        });

    }
}
