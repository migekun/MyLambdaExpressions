package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample3 {
    public static void main(String[] args) {
        //grouping by length of string and algo checking the names contains e
        List<String> name = List.of("Sid", "Mike", "Jenny", "Gene", "Miguel");
        Map<Integer, List<String>> result = name.stream()
                .collect(Collectors.groupingBy(
                        String::length, LinkedHashMap::new,
                        Collectors.filtering(s->s.contains("e"), Collectors.toList())));
        System.out.println("result = " + result);
        System.out.println("-------------");
        //instructor grouping by senior and junior, senior(experince>10) junior(experience<10) and filter then
        //by online courses
        Map<String, List<Instructor>> instructorsByExperienceOnline = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(instructor ->
                                instructor.getYearsOfExperience()>10 ? "Senior":"Junior",
                        LinkedHashMap::new,
                        Collectors.filtering(Instructor::isOnlineCourse, Collectors.toList())));
        instructorsByExperienceOnline.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
    }
}
