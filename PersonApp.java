package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class PersonApp {
    public static void main(String[] args) {

        Person person0 = new Person("jan", "Kowalski", 33);
        Person person1 = new Person("adan", "Kowal", 16);
        Person person2 = new Person("franek", "Kolo", 34);
        Person person3 = new Person("tadek", "Kowa", 10);
        Person person4 = new Person("kuba", "Kowalski", 35);
        Person person5 = new Person("daniel", "Kowalski", 38);

        List<Person> people = Arrays.asList(person0, person1, person2, person3, person4, person5);

        Consumer consumer = personX -> System.out.println(personX);


        consumeList(people, consumer);
        consumeList(people, System.out::println);


//        filterByPredicate(people, personeX ->

                applyToList(people, person -> {
                    person.setAge(person.getAge() + 1);
                    return person;
                });

        consumeList(people, consumer);
    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T t: list){
            consumer.accept(t);
        }
    }

    static <T> void filterByPredicate(List<T> list, Predicate<T> predicate) {
        for (T t2 : list) {
            predicate.test(t2);

        }

    }

    static <T> void applyToList(List<T> list, Function<T, T> function) {
        for (T tt:list
             ) {
            function.apply(tt);
            list.set(list.size(),tt);

            
        }


    }
}
