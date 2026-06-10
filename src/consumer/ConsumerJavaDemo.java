package consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerJavaDemo {
    public static void main(String[] args) {
        Consumer<Integer>consumer1=(a)->System.out.println(a);
        consumer1.accept(5);
        Consumer<String>consumer2=str-> System.out.println("Length:"+str.length());
        consumer2.accept("Akhil");

        List<Integer> numbers= Arrays.asList(2,8,6,0);
        Consumer<Integer>consumer3=num-> System.out.println(num*2);
        numbers.forEach(consumer3);

    }
}
