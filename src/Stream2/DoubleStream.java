package Stream2;

import java.util.List;
import java.util.Map;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DoubleStream {
    public static void main(String[] args) {
        List<String> cats = List.of("cat", "puma", "lynx");
        List<String> dogs = List.of("labrador", "wolf", "husky");

        Stream.concat(cats.stream(), dogs.stream())
                .filter(s -> s.startsWith("l"))
                .forEach(System.out::println);

        cats.stream().filter(s -> s.length() > 3)
                .peek(System.out::println)
                .findAny();

        OptionalInt reduce = IntStream.range(1, 5)
                .peek(System.out::println)
                .reduce(Integer::sum);
        System.out.println(reduce.getAsInt());

        IntStream.range(1, 10000).filter(s -> s % 2 == 0).peek(System.out::println).count();

        List<Dog> dogs1 = List.of(
                new Dog("Hasky", "summer", 12, 12),
                new Dog("Ovcharka", "chips", 21, 12),
                new Dog("Labrador", "tuzik", 11, 12)
        );

        Map<String, Dog> collect = dogs1.stream().collect(Collectors.toMap(Dog::getName, s -> s));
        collect.forEach((c, o) -> System.out.println(c + "->" + o));
        Map<Integer, List<Dog>> collect1 = dogs1.stream().collect(Collectors.groupingBy(Dog::getWeight));
        System.out.println(collect1);
    }
}
