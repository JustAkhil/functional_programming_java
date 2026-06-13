package Stream.Error_handling_stream;

import java.util.Arrays;
import java.util.List;

public class ErrorHandlingStream {
    static void main() {
        List<String>languages= Arrays.asList("Java","C++","Dart");
        languages.stream().forEach((b)->{
            try{
                if(b.equals("Dart")){
                    throw new RuntimeException("Inavalid Book");
                }
                System.out.println(b);
            }catch (Exception e){
                e.printStackTrace();
            }
        });
    }
}
