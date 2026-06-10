package BiFunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionDemo {
    static BiFunction<Integer,Integer,Integer>addFunc=(a,b)->a+b;
    static BiFunction<Integer,Integer,Integer>addFuncMethodRef=Integer::sum;
    public static void main(String[] args) {
        Function<Integer,Integer>multiply=x->x*2;
        BiFunction<Integer,Integer,Integer>combineFunc=addFunc.andThen(multiply);
        System.out.println(combineFunc.apply(2,6));
    }
}
