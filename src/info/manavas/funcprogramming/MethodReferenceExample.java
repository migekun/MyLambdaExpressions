package info.manavas.funcprogramming;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample {
    public static void main(String[] args) {
        Predicate<Instructor> p1 = (i) -> i.isOnlineCourse();
        Predicate<Instructor> p2 = Instructor::isOnlineCourse;

        Function<Integer, Double> sqrt = (n) -> Math.sqrt(n);
        Function<Integer, Double> sqrt2 = Math::sqrt;

        Function<String, String> lowerCaseFunct = (s) -> s.toLowerCase();
        Function<String, String> lowerCaseFunct2 = String::toLowerCase;
    }
}
