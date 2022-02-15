package info.manavas.funcprogramming;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
    public static void main(String[] args) {
        //Map of instructors with name and year of experience
        //Function which will List<Instructors> and return a Map<String, Integer>
        //Predicate will return true if instructor has online courses

        Predicate<Instructor> p1 = Instructor::isOnlineCourse;

        Function<List<Instructor>, Map<String, Integer>> mapFunction = (instructors -> {
            Map<String, Integer> map = new HashMap<>();
            instructors.forEach(instructor -> {
                if (p1.test(instructor)) {
                    map.put(instructor.getName(), instructor.getYearsOfExperience());
                }
            });
            return map;
        });

        System.out.println(mapFunction.apply(Instructors.getAll()));

        System.out.println("--------------- Test andThen VS compose");

        Function<Double, Double> half = (a) -> a / 2;
        Function<Double, Double> twice = (a) -> a * a;

        Function<Double, Double> squareAndThenCube = half.andThen(twice);
        Double result = squareAndThenCube.apply(3d);
        System.out.println(result);

        Function<Double, Double> squareComposeCube = half.compose(twice);
        result = squareComposeCube.apply(3d);
        System.out.println(result);

        Function<Double, Double> cubeAndThenSquare = twice.andThen(half);
        result = cubeAndThenSquare.apply(3d);
        System.out.println(result);

        Function<Double, Double> cubeComposeSquare = twice.compose(half);
        result = cubeComposeSquare.apply(3d);
        System.out.println(result);
    }
}
