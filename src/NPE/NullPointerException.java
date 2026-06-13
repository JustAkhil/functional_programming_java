package NPE;

import java.util.Optional;

public class NullPointerException {
    static void main() {
        String name="Nanu";
       if(name != null){
           System.out.println(name.length());
       }else {
           System.out.println("Empty String");
       }


       // Create optionals
        Optional<String>optionalString=Optional.of("java");
        System.out.println(optionalString);

        // empty optional

        Optional<String>emptyOptional=Optional.empty();
        System.out.println(emptyOptional);

        // Creating null optional
        Optional<String>mayBe=Optional.ofNullable(null);
        System.out.println(mayBe);
        System.out.println(mayBe.isPresent());

        //get()

        System.out.println(optionalString.get());

        //safe value retrieval

        // Method 1 orElse("Default value")
        System.out.println(optionalString.orElse("default value"));
        System.out.println(mayBe.orElse("default value"));


        //orElseGet(<Supplier>)
        String result=mayBe.orElseGet(()->{
            System.out.println("Generating Default Value");
            return "Default Value";
        });
        System.out.println(result);

        // orElseThrow()

        String newResult=optionalString.orElseThrow(()->new RuntimeException("Value is null"));
        System.out.println(newResult);







    }
}
