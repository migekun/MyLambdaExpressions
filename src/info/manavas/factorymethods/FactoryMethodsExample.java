package info.manavas.factorymethods;

import java.util.*;

public class FactoryMethodsExample {
    public static void main(String[] args) {
        //How to create unmodifiable list pre Java 9
        List<String> names = new ArrayList<>();
        names.add("Miguel");
        names.add("Maria");
        names.add("Jose");
        names = Collections.unmodifiableList(names);
        System.out.println("names = " + names);

        List<String> names2 = List.of("Miguel", "Sayo", "Antonio");
        System.out.println("names2 = " + names2);
        Set<String> set = Set.of("Miguel", "Sayo", "Antonio");
        System.out.println("set = " + set);
        Map<String, String> map = Map.of("Grade1", "Miguel", "Grado2", "Sayo");
        System.out.println("map = " + map);
        //modify the list
//        names2.add("Jose"); //.UnsupportedOperationException
//        set = Set.of("Miguel", "Miguel", "Sayo"); //.IllegalArgumentException: duplicate element: Miguel
//        names.sort(Comparator.naturalOrder()); //UnsupportedOperationException
    }
}
