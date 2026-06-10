package predicate.biPredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {

        BiPredicate<Integer, Integer> isGreaterThan = (a, b) -> {
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            }else{
                System.out.println(a + " is greater than " + b);
            }
            return a > b;
        };

        System.out.println(isGreaterThan.test(0, 6));
    }
}