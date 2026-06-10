package interface_function;

import java.util.function.Function;

public class FunctionInterface {
    public static Function<Integer,Integer>addFunction=(a)->a+4;
    static void main(String[] args) {
        System.out.println(addFunction.apply(200));
    }
}

