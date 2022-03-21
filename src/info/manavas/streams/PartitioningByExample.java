package info.manavas.streams;

import info.manavas.funcprogramming.Instructor;
import info.manavas.funcprogramming.Instructors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PartitioningByExample {
    public static void main(String[] args) {
        //partition instructors in two groups of intructors
        //first is years of experience is > 10 and other is <=10
        Predicate<Instructor> experiencePredicate = instructor -> instructor.getYearsOfExperience() > 10;
        Map<Boolean, List<Instructor>> partitionMap = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiencePredicate));
        partitionMap.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));
        System.out.println("-----------------------");
        //partition but returns set
        Map<Boolean, Set<Instructor>> partitionMap2 = Instructors.getAll().stream()
                .collect(Collectors.partitioningBy(experiencePredicate, Collectors.toSet()));
        partitionMap2.forEach((key, value) -> System.out.println("key = " + key + " value = " + value));

    }
}
