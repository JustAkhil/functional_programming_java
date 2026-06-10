package consumer.biConsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {
    public static void main(String[] args) {
        BiConsumer<Integer,Integer>add=(a,b)-> System.out.println(a+b);
        add.accept(4,9);
    }
}
