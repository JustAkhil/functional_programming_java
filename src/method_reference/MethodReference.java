package method_reference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodReference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Akhil", "Neeraj");
        //normal for loop
//        for(int i=0; i<names.size(); i++){
//            System.out.println(names.get(i));
//        }
        //enhance for each loop
//        for(String name:names){
//            System.out.println(name);
//        }
        // normal for each loop

//        names.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
        //for each using lambda
        names.forEach((String name) -> {
            System.out.println(name);
        });

        //for each using method reference
        names.forEach(System.out::println);
    }

}
