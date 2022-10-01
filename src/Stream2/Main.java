package Stream2;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    private static Random rand = new Random();
    private static final Function<Integer, String> converter = s -> s + "now it is string";
    private static final Predicate<Integer> biggerThen10 = s -> s > 10;
    private static final Consumer<String> greetings = s -> System.out.printf("hello %s", s);
    private static final Supplier<Integer> getRandomInteger = () -> rand.nextInt();

    public static void main(String[] args) {
        //Function interface
        String IntToString =converter.apply(12);
        System.out.println(IntToString);

        Map<String,Integer> nameMap = new HashMap<>();
        Integer value = nameMap.computeIfAbsent("John",s -> s.length());
        System.out.println(value);

        //Predicate interface
        boolean bigger = biggerThen10.test(12);
        System.out.println(bigger);

        List<String> names = Arrays.asList("Angela","Aron","Bar","Gak");
        names.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //Consumer interface
        greetings.accept("Alex");
        System.out.println();

        Map<String,Integer> ages = new HashMap<>();
        ages.put("John",25);
        ages.put("Freddy",24);
        ages.put("Samuel",30);

        ages.forEach((name,age) -> System.out.println(name + " is " + age + " years old"));

        //Supplier interface
        System.out.println(getRandomInteger.get());


    }
}
