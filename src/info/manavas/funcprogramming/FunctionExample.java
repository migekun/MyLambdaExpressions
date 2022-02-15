package info.manavas.funcprogramming;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer, Double> sqrt = n -> Math.sqrt(n);
        System.out.println("Square root of 64: "+ sqrt.apply(64));
        System.out.println("Square root of 81: "+ sqrt.apply(81));

        Function<String, String> lowercaseFunction = (s) -> s.toLowerCase();
        System.out.println(lowercaseFunction.apply("PRUEBA"));

        Function<String, String> concatenateFunction = (s) -> s.concat(" In JAVA");

        //Primero hace un lowercase del String y después concatena el string
        System.out.println(lowercaseFunction.andThen(concatenateFunction).apply("PROGRAMMING"));

        //compone las dos funciones y después las aplica al string elegido,
        // es decir concatena los string y después les aplica lowercase
        System.out.println(lowercaseFunction.compose(concatenateFunction).apply("PROGRAMMING"));

    }
}
