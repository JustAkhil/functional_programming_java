package Terminal_Operation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class TerminalOperation {
    static void main() {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40,55,33);
        int sumOfNum=0;
        for(int num:numbers){
            sumOfNum+=num;
        }
        System.out.println(sumOfNum);

        // By reduce();
        int total=numbers.stream().reduce(0, (acc, num) -> acc + num);
        //initial value =0 then 0+10=10 then 10+20=30 then 30+30=60 then 60+40=100
        // identity->initial value accumulator->operation num ->number in list
        System.out.println(total);



        // collect()
        List<Integer>evenNumbers=numbers.stream()
                .filter((s)->s%2==0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);

        // find & match

        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        boolean has40=numbers.stream().anyMatch((n)->n==40);
        System.out.println(has40);
    }
}
