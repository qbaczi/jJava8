package cwiczenia;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class PersonApp {
    public static void main(String[] args) {

        Person person = new Person("jan", "Kowalski",33);
        Person person1 = new Person("adan", "Kowal",33);
        Person person2 = new Person("franek", "Kolo",34);
        Person person3 = new Person("tadek", "Kowa",36);
        Person person4 = new Person("kuba", "Kowalski",35);
        Person person5 = new Person("daniel", "Kowalski",38);

        List<Person> people = Arrays.asList(person, person1, person2, person3, person4, person5);

        Consumer consumer = personX -> System.out.println(personX);

        consumeList(people,consumer);
        consumeList(people, System.out::println);

    }

    static <T> void consumeList(List<T> list, Consumer<T> consumer){
        for (T t: list){
            consumer.accept(t);
        }
    }
}
