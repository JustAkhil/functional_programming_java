package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Lichi", "Mango");
//        fruits.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        fruits.forEach((s)-> System.out.println(s));
//        Stream<String>allFruits=fruits.stream();
////        allFruits.forEach((s)-> System.out.println(s));
//        Stream<String>filterFruits=allFruits.filter(name->name.startsWith("A"));
//        filterFruits.forEach(s -> System.out.println(s));

        fruits.stream().filter(name -> name.startsWith("L")).forEach(s -> System.out.println(s));
    }
}
