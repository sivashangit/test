import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        for (int i=0;i<1000;i++){

            Thread.sleep(2000);
            System.out.println("spring boot running");
        }
        for (int i=0;i<10;i++){

            Thread.sleep(2000);
            System.out.println("spring boot ");


        }





        /*List<String> str= Arrays.asList("muruga","muruga","one","two");

        str.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        str.forEach((k,v)-> {
            System.out.println("key" + k + ":value" + v);
        });*/

    }
}