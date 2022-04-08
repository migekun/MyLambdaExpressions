package info.manavas.java10improvements;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TypeInterferenceExample {

    //var number4 = 5; //solo se pueden definir var en local scope, global scope da error de cannot be resolve symbol

    public static void main(String[] args) {
//        String name = "Miguel";
        var name = "Miguel";
        System.out.println("name = " + name);
        var dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        HashMap<Integer, String> map = new HashMap<>();
        var map1 = new HashMap<Integer, String>();

        //integer array
        int[] numbers = {1,2,3,4,5,6};
        var numbers1 = new int[]{1,2,3,4,5,6};

        //list
        List<String> names = new ArrayList<>();
        names.add("Miguel");
        names.add("Sayo");
        System.out.println("names = " + names);

        var names1 = new ArrayList<>();
        names1.add("Gene");
        names1.add(1.0000);
        names1.add(1);
        System.out.println("names1 = " + names1);

        var integer = List.of(1,2,3,4,5);
        integer.forEach(System.out::println);

        //int num = 99999999999999L; no funciona el long
        var num = 99999999999999L;// le da igual, int, double o long
        var num1 = 99999999999999.999999995;// le da igual, int, double o long

        var result = 9/2;
        System.out.println("result = " + result);

        var result1 = 9.0/2;
        System.out.println("result1 = " + result1);

        result1 = 11d/2d;
        System.out.println("result1 = " + result1);

        var idiomOfTheDay = "A blessing in disguise";
        printString(idiomOfTheDay);
    }

    public static void printString(String toPrint) {
        System.out.println("toPrint = " + toPrint);
    }
}
