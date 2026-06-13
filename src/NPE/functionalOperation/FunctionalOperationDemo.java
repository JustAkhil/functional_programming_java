package NPE.functionalOperation;

import java.util.Optional;

public class FunctionalOperationDemo {
    static void main() {
        Optional<String> name = Optional.of("Java");
        Optional<String> nullOptional = Optional.ofNullable(null);
        // if present()
        // if value present then execuate the bloc otherWise not execute
        name.ifPresent((s) -> System.out.println(s));
        nullOptional.ifPresent((s) -> System.out.println(s));

        // map()

        Optional<String> upperCase = name.map((s) -> s.toUpperCase());
        System.out.println(upperCase.orElse("Default"));


        //filter()

        Optional<String>temp=name.filter((s)->s.startsWith("F"));
        System.out.println(temp.orElse("Not Start With F"));
        temp.ifPresent((s)-> System.out.println("Not Present"));


        // combine operation

        name.filter((s)->s.startsWith("J"))
                .map((s)->s.toUpperCase())
                .ifPresent((s)-> System.out.println(s));
    }
}
