package supplier;

import java.util.function.Supplier;

public class SupplierDemo {
    static void main() {
        Supplier<Double>randomNum=()-> Math.random()*1000;
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
        System.out.println(randomNum.get());
    }
}
