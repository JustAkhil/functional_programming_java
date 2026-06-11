package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPipeline {
    static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(4,6,7,2,10);
//        for (int i=0; i<numbers.size(); i++){
//            if(numbers.get(i)%2==0){
//                System.out.println(numbers.get(i));
//            }
//        }
        //iteration 1
        Stream<Integer>num=numbers.stream();
        Stream<Integer>isEven=num.filter(p2);
        List<Integer>isEvenNumber1=isEven.toList();
        System.out.println(isEvenNumber1);


        //iteration 2
        List<Integer>evenNumbers=numbers.stream().filter(p2).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }

    //Method 1
    static Predicate<Integer>p1=new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            if(integer%2==0){
                return true;

            }
            return false;
        }
    };

    //Method 2
    static  Predicate<Integer>p2=num->num%2==0;
}
