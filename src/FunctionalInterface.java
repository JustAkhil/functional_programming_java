@java.lang.FunctionalInterface
interface BookActions {
    void perform();
}
@java.lang.FunctionalInterface
interface Add {
     int add(int a, int b);
}

//we use lambda to remove this boiler plate code
// syntax ()->{};
public class FunctionalInterface {
    public static void main(String[] args) {
//        BookActions bookActions=new BookActions() {
//            @Override
//            public void perform() {
//                System.out.println("Step1");
//            }
//        };
        BookActions bookActions = () -> {
            System.out.println("Step 2");
        };
        bookActions.perform();
        BookActions bookActions1 = () -> {
          System.out.println("Step 3");
        };
        bookActions1.perform();
        Add addOperation=(int a,int b)->{
            return  a+b;
        };
        System.out.println(addOperation.add(1,2));
    }

}
