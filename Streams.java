package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

//        numbers.stream().forEach(number -> System.out.println(number));

        numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(number -> number * 2)
                .forEach(System.out::println);

        Integer integer = numbers.stream()
                .filter(number -> number > 10)
                .map(number -> number * 10)
                .min(Integer::compareTo)
                .get();

        System.out.println(integer);

        List<String> stringList = Arrays.asList("anna","tomek", "franek","władek","damian");

        stringList.stream()
                .filter(name -> name.length()>5)
                .map(name-> name.toUpperCase())
                .map(name-> "@" + name)
                .limit(2)
                .forEach(System.out::println);

    }
}
