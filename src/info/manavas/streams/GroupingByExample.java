package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByExample {
    public static void main(String[] args) {
        List<String> names = List.of("Syed", "Mike", "Jenny", "Gene", "Rajeev", "Miguel", " ");
        Map<Integer, List<String>> result = names.stream().collect(Collectors.groupingBy(String::length));
        System.out.println("result = " + result);
        System.out.println("---------------");
        //grouping instructor by gender
        Map<String, List<Instructor>> instructorByGender = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getGender));

        instructorByGender.forEach((key, value)-> {
            System.out.println("key = " + key + " value = " + value);
        });
        // grouping by experience >10 senior otherwise junior
        Map<String, List<Instructor>> instructorsByExperience = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor ->
                    instructor.getYearsOfExperience() > 10 ? "Senior": "Junior"
                ));
        instructorsByExperience.forEach((key, value) ->{
            System.out.println("key = " + key + " value= " + value);
        });
    }
}
