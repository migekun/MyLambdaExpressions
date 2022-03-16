package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorMappingExample {
    public static void main(String[] args) {
        //map
        List<String> nameList = Instructors.getAll().stream()
                .map(Instructor::getName)
                .collect(Collectors.toList());
        nameList.forEach(System.out::println);

        //mapping
        nameList = Instructors.getAll().stream()
                .collect(Collectors.mapping(Instructor::getName, Collectors.toList()));
        nameList.forEach(System.out::println);

        //Instrucotrs by their years of experience
        Map<Integer, List<String>> mapYearsOdExperienceAndNames = Instructors.getAll().stream().collect(
                Collectors.groupingBy(
                        Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));
        mapYearsOdExperienceAndNames.forEach((key, value)-> {
            System.out.println("key = " + key + " value = " + value );
        });
    }
}
